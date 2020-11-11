# geo-event-sourcing

Inspired by Greg Young's talk [want don't You consistency no stinking](https://www.youtube.com/watch?v=m1FhLPmiK9A),
I created this repo to implement what I have learned.

# Objectives

1. there are 3 separate data centers: london, tokio & seattle
2. data cententers are locally consistent
3. events between data centers are synchronized
4. inconsistent states between datacenters are detected

# Use cases
1. user can increment counter by number
2. user can decrement counter by number, if after substraction 
counter stays positive
