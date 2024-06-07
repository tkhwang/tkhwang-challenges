/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ["./App.{js,jsx,ts,tsx}", "./<custom directory>/**/*.{js,jsx,ts,tsx}"],
  theme: {
    extend: {},
  },
  plugins: [],
  "tailwindCSS.experimental.classRegex": [
    "tw`([^`]*)", // tw`...`
    'tw="([^"]*)', // <div tw="..." />
    'tw={"([^"}]*)', // <div tw={"..."} />
    "tw\\.\\w+`([^`]*)", // tw.xxx`...`
    "tw\\(.*?\\)`([^`]*)", // tw(Component)`...`
  ],
}
