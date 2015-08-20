# User Agent Viewtool

## Credit
This tool implements a viewtool that uses the nice user-agent-utils project by Harold Walker.
 
http://www.bitwalker.eu/software/user-agent-utils

## Usage
```
viewtool: $useragent

agent: $useragent.agent
type: $useragent.type
browser: $useragent.browser
version: $useragent.version
os: $useragent.os
manufacturer: $useragent.manufacturer
engine: $useragent.engine
```

---
# Types
The `$useragent.type` returns one of the following Strings that you can use to check against:
* COMPUTER
* MOBILE
* TABLET
* GAME_CONSOLE
* WEARABLE
* DMR (Digital media receiver like the Google TV)
* UNKNOWN

---
# Browsers
The `$useragent.browser` returns one of the following Strings that you can use to check against:
### Apple
* APPLE_ITUNES 
* APPLE_MAIL- Deprecated. 
* APPLE_WEB_KIT 
* BLACKBERRY10 
* BOT 
* BOT_MOBILE 
* CAMINO 
* CAMINO2 
* CFNETWORK 

### Google Chrome browser
* CHROME
* CHROME_MOBILE 
* CHROME10 
* CHROME11 
* CHROME12 
* CHROME13 
* CHROME14 
* CHROME15 
* CHROME16 
* CHROME17 
* CHROME18 
* CHROME19 
* CHROME20 
* CHROME21 
* CHROME22 
* CHROME23 
* CHROME24 
* CHROME25 
* CHROME26 
* CHROME27 
* CHROME28 
* CHROME29 
* CHROME30 
* CHROME31 
* CHROME32 
* CHROME33 
* CHROME8 
* CHROME9 
* DOLFIN2 
* DOWNLOAD 
* EUDORA 
* EVOLUTION 

### Firefox
* FIREFOX 
* FIREFOX_MOBILE 
* FIREFOX_MOBILE23 
* FIREFOX1_5 
* FIREFOX10 
* FIREFOX11 
* FIREFOX12 
* FIREFOX13 
* FIREFOX14 
* FIREFOX15 
* FIREFOX16 
* FIREFOX17 
* FIREFOX18 
* FIREFOX19 
* FIREFOX2 
* FIREFOX20 
* FIREFOX21 
* FIREFOX22 
* FIREFOX23 
* FIREFOX24 
* FIREFOX25 
* FIREFOX26 
* FIREFOX27 
* FIREFOX28 
* FIREFOX29 
* FIREFOX3 
* FIREFOX30 
* FIREFOX3MOBILE 
* FIREFOX4 
* FIREFOX5 
* FIREFOX6 
* FIREFOX7 
* FIREFOX8 
* FIREFOX9 
* FLOCK 

### Internet Explorer browsers
* IE
* IE10 
* IE11 
* IE5 
* IE5_5 
* IE6 
* IE7 
* IE8 
* IE9 
* IEMOBILE10 
* IEMOBILE11 - Since 2007 the mobile edition of Internet Explorer identifies itself as IEMobile in the user-agent.
* IEMOBILE6 
* IEMOBILE7 
* IEMOBILE9 

### Other
* KONQUEROR 
* LOTUS_NOTES 
* LYNX 
* MOBILE_SAFARI 
* MOZILLA 
* NETFRONT 
* OMNIWEB 
* OPERA 
* OPERA_MINI 
* OPERA10 
* OPERA11 
* OPERA12 
* OPERA15 
* OPERA16 
* OPERA17 
* OPERA18 
* OPERA19 
* OPERA20 
* OPERA9 

### Outlook email client
* OUTLOOK
* OUTLOOK_EXPRESS7 - Since version 7 Outlook Express is identifying itself.
* OUTLOOK2007 - 
Microsoft Outlook 2007 identifies itself as MSIE7 but uses the html rendering engine of Word 2007.
* OUTLOOK2010 - 
Outlook 2010 is still using the rendering engine of Word.
* OUTLOOK2013 
* POCOMAIL 
* SAFARI 
* SAFARI4 
* SAFARI5 
* SAFARI6 
* SEAMONKEY 
* SILK 
* THEBAT 
* THUNDERBIRD 
* THUNDERBIRD10 
* THUNDERBIRD11 
* THUNDERBIRD12 
* THUNDERBIRD2 
* THUNDERBIRD3 
* THUNDERBIRD6 
* THUNDERBIRD7 
* THUNDERBIRD8 
* UNKNOWN 