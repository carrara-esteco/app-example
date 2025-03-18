const PROXY_CONFIG = [
    {
        context: [
            "/rest",
            "/api"
        ],
        target: "http://localhost:8080",
        secure: false,
        ws: false
    }
];

module.exports = PROXY_CONFIG;
