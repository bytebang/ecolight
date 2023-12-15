
const score = document.querySelector('.score');


async function getRequest(endpoint) {
    // Returning the fetch promise
    return await fetch(endpoint)
        .then(response => {
            if (!response.ok) {
                throw new Error(`HTTP error! Status: ${response.status}`);
            }
            return response.json();
        })
        .then(data => {
            console.log('Received data:', data);
            // Use the received data as needed in your website
            return data; // Return the data for further use
        })
        .catch(error => {
            console.error('Error:', error);
            throw error; // Re-throw the error to be caught by the caller if needed
        });
}


async function calculateScore() {
    try {
        // Wait for the asynchronous operation to complete
        const values = await getRequest('/api/currentValues');

        // Now you can iterate over the values
        values.forEach(entry => {
            // Do something with each entry
            console.log(entry);
            if(values.lowerbound < values.temperature < values.upperbound){

            }
        });

        // Continue with other logic after processing the values
    } catch (error) {
        // Handle errors here
        console.error('Error:', error);
    }
}

// Call the asynchronous function
calculateScore();


// Example usage:
//getRequest('/api/historicalValues');
//getRequest('/api/currentValues');





