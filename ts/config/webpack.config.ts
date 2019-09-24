import * as path from 'path';
import * as webpack from 'webpack';
import ForkTsCheckerWebpackPlugin from 'fork-ts-checker-webpack-plugin';

const config: webpack.Configuration = {
  entry: './src/index.ts',
  module: {
    rules: [
      {
        test: /\.tsx?$/,
        loader: 'ts-loader',
        exclude: /node_modules/,
        options: {
          transpileOnly: true,
        },
      },
    ]
  },
  plugins: [
    new ForkTsCheckerWebpackPlugin(),
  ],
  resolve: {
    extensions: ['.tsx', '.ts'],
  },
  output: {
    filename: 'index.js',
    path: path.resolve(__dirname, '../../executor/src/resources')
  }
};

export default config;
