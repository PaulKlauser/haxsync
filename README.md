HaxSync by Codarama
=======

This project is forked from the original [HaxSync](https://github.com/mots/haxsync) project by Mathias Roth

Current state
---

[![Build Status](https://travis-ci.org/Codarama/haxsync.svg?branch=master)](https://travis-ci.org/Codarama/haxsync)

The project is currently **not working**.

The project is currently **not available for download** at Google Play.

Q&A
---
**What are the next steps?**

1. Clean up project, set up build and test infrastructure
2. Test current functionality, fix any bugs that were introduced during the transition
3. Workaround issues with Facebook Android API
4. Release a new version via Google Play

**What ambitious future plans do you have?**

1. Upgrade APIs to latest versions
2. Remove dependencies on stale 3rd party libs
3. Extend functionality

**Why did you change the package structure?**

I really appreciate that Mathias has left this project to the open source community. The licensing he has used has no explicit requirement to either stick with the original package names or change them. However, out of respect to his work, I'd like to make it possible to distinguish his original work and the modified version.

**How do you plan to workaround the issues of Facebook API not providing the required information**

There are really a number of ways. First step would be to see exactly which information is missing. The next one would be to provide an alternative way of retrieving it.

**Why do you need to hack Facebook's API?**

First off - I fully agree with Facebook's decision to improve the privacy of users by deprecating their APIs to automatically extract information about a given user's friends. However I believe that what this software is doing is not abusing this privacy improvement in any way. Everybody could manually download the profile picture of his friends in Facebook and manually place them as profile pictures in their phone book at any given moment. Automating this process would not jeopardize the privacy of anybody.

**Anything else?**

Write back and you will get the answers you need.

Contacts
---
Tihomir Mateev - lead developer
tihomir.mateev@gmail.com

Contributions to this project are welcome.