# sherlock

This wordsum code is to investigate the findings of watson to see if they lead to solving a solution.

This code uses wordsum test data and maybe later be merged with it.

Currently only Watson's features Language and Visual are used.

### Language

Of Language only Natural Language Classifier, Natural Language Understanding, Personality Insights, Tone Analyzer.

### Visual

The Visual Recognition will be attempted and is planned as soon I can think of how to find a bunch off book covers and
judge them by their covers.


## Requirements and Setup

### Requirements

- Java 8
- Watson account
- Internet access

### Getting a WatsonAnalytics Account

1. Go to https://www.ibm.com/account/us-en/signup/register.html?a=MTBmNDg2NDktNDI2MC00
2. Fill-out form and click enter.
3. Wait for email with confirmation code in the page following information form.
4. Input the confirmation code.
5. Sign-up for WatsonAnalytics by clicking the top-right green button.
6. Input Company and Phone number again and click enter.
7. Go here https://watson.analytics.ibmcloud.com/home/data

### Getting Bluemix account if already have a WatsonAnalytics Account

1. Go to https://console.bluemix.net/registration
2. Input email and phone number and click button.

### Getting access to their APIs.

1. On you bluemix consul, click the hamburger.
2. Select 'Services'.
3. Select 'Watson'.
4. On the Dashboard, click the button 'Create Watson service'
5. Add a service and repeat until all are selected. Lite have free tiers.
6. Read terms of use.
7. For this data set select Natural Language Classifier, Natural Language Understanding, Personality Insights, Tone Analyzer


### Executing Code

Unit Tests (Work in progress)


### Output

Return data from Watson is outputted in the file directory src/test/resources/watson

It will classify it by using a file heirarchy based up the Watson's features and services.

The output file name will be the same as the file input.

json format is preferred.


### Use Cases

- Find the protagonist in a story.

- Find primary conflict in a story.

- Find humor in a story.

- Find relationships between characters in a story.

- Define and understand tropes in a story.

- Tone variance to note and warn increase of anger or happiness or approval or disapproval.

- Find sarcasm.

