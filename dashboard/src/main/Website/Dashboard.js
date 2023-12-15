function getRequest(endpoint) {
    fetch(endpoint)
        .then(response => response.json())
        .then(data => {
            console.log('Received data:', data.receivedValues);
            // Use the received data as needed in your website
        })
        .catch(error => {
            console.error('Error:', error);
        });
}

// Example usage:
getRequest('/api/historicalValues');
getRequest('/api/currentValues');
