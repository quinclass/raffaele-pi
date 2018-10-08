const path = require('path');

module.exports = {
    entry: './src/index.js',
    devtool: 'inline-source-map',
    mode: 'development',
    devServer: {
        contentBase: './dist'
    },
    output: {
        filename: 'main.js',
        path: path.resolve(__dirname, 'dist')
    },
    module: {
        rules: [
            {
                test: /\.js$/,
                exclude: /node_modules/,
                use: {
                    loader: 'babel-loader',
                    options: {
                        presets: ['@babel/preset-env']
                    }
                }
            },
            {
                test: /\.scss$/,
                use: ["style-loader","css-loader","sass-loader"]
            }
        ]
    }
};