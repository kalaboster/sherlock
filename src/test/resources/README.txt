## resources

resources folder contains the testing resources and this file will attempt to
give them purpose.

The purpose is to be able to not only test's Watson ability to do what it claims,
but also to create data to test features to use Watson.

### read

read contains the data to be read by wordsum or watson.
It's hierarchy is written to better classify the data.

read contain sentence, sentiment and story.

sentence contains files directories with permutations
of simple, compound and complex sentences.

sentiment contains files with sentences of a type of sentiment.

story contains a genre range of stories by the same writer or organization.

### watson

watson contains a hierarchy that uses IBM Waton's classification labels.

The purpose is to create an location to output return from watson after it
reads the data in read that can then be used to write tools to analyze and
pass judgement on the data.
