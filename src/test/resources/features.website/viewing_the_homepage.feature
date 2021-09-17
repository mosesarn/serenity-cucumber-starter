Feature: Viewing the homepage
  Rule: Current packages should be shown on the homepage
    Example: Daniel views the current available packages
      Given Daniel is on the HeartInternet homepage
      When he views the currently available packages
      Then he should be presented with
      | Name              | Price |
      | Web Hosting       | £3.99 |
      | WordPress Hosting | £3.99 |
      | Reseller Hosting  | £31.49|


