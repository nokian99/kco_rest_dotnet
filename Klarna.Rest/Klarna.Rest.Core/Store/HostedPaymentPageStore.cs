﻿using System.Threading.Tasks;
using Klarna.Rest.Core.Common;
using Klarna.Rest.Core.Commuication;
using Klarna.Rest.Core.Commuication.Dto;
using Klarna.Rest.Core.Model;
using Klarna.Rest.Core.Serialization;

namespace Klarna.Rest.Core.Store
{
    /// <summary>
    /// Hosted Payment Page API
    /// Hosted Payment Page (HPP) API is a service that lets you integrate Klarna Payments without the need of hosting the web page that manages the client side of Klarna Payments.
    /// A complete HPP payment session will involve three of Klarna services:
    /// * Klarna Payments API to start a payment session.
    /// * Hosted Payment Page API to distribute a payment session.
    /// * Order Management API to capture payment or refund consumer.
    /// </summary>
    public class HostedPaymentPageStore : BaseStore
    {
        internal HostedPaymentPageStore(ApiSession apiSession, IJsonSerializer jsonSerializer) : base(apiSession, ApiControllers.HostedPaymentPage, jsonSerializer) { }

        /// <summary>
        /// Create a new HPP session
        /// </summary>
        /// <param name="session">The <see cref="HostedPaymentPageCreateSessionRequest"/> object</param>
        /// <returns>A single <see cref="HostedPaymentPageCreateSessionResponse"/> object</returns>
        public async Task<HostedPaymentPageCreateSessionResponse> CreateSession(
            HostedPaymentPageCreateSessionRequest session)
        {
            var url = ApiUrlHelper.GetApiUrlForController(ApiSession.ApiUrl, ApiControllerUri);

            var response = await Post<HostedPaymentPageCreateSessionResponse>(url, session);

            return response;
        }

        /// <summary>
        /// Distribute link to the HPP session
        /// </summary>
        /// <param name="sessionId">HPP session id</param>
        /// <param name="distribution">The <see cref="HostedPaymentPageDistributeLink"/> object</param>
        /// <returns></returns>
        public async Task DistributeLinkToSession(string sessionId, HostedPaymentPageDistributeLink distribution)
        {
            var url = ApiUrlHelper.GetApiUrlForController(ApiSession.ApiUrl, ApiControllerUri, $"{sessionId}/distribution");

            await Post(url);
        }

        /// <summary>
        /// Get HPP session status
        /// </summary>
        /// <param name="sessionId">HPP session id</param>
        /// <returns>A single <see cref="HostedPaymentPageSessionStatus"/> object</returns>
        public async Task<HostedPaymentPageSessionStatus> GetSessionStatus(string sessionId)
        {
            var url = ApiUrlHelper.GetApiUrlForController(ApiSession.ApiUrl, ApiControllerUri, $"{sessionId}/status");

            var response = await Get<HostedPaymentPageSessionStatus>(url);

            return response;
        }
    }
}
