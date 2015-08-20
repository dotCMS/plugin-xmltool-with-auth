# XMLTool with Auth

## Description
This tool reimplements the XMLTool included with dotCMS but adds the ability to use basic HTTP-AUTH and also to do a POST and pass a map of parameters as data

## Usage
```
viewtool: $xmlauthtool

#set($data = $contents.getEmptyMap())
#set($dummy = $data.put("var1", "here is var 1"))
#set($dummy = $data.put("var2", "var2"))

#set($xml = $xmlauthtool.read("https://myxmlpost.com/postToMe.xml", "username", "password", $data))

```
