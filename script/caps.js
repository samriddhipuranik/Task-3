const fs = require('fs');

function convertToCaps(inputString, outputFilePath) {
    const resultString = inputString.toUpperCase();
    fs.writeFileSync(outputFilePath, resultString);
}

// Usage
const inputString = process.argv[2];
const outputFilePath = process.argv[3];

if (!inputString || !outputFilePath) {
    console.error("Usage: node caps.js <input_string> <output_file_path>");
    process.exit(1);
}

convertToCaps(inputString, outputFilePath);
