import groovyx.net.http.RESTClient
import groovy.json.JsonSlurper
import org.codehaus.groovy.antlr.LexerFrame
URL url = 'https://jsonplaceholder.typicode.com/'
//def apiUrl = 'https://jsonplaceholder.typicode.com/'
def body = 'posts'
def client = new RESTClient(apiUrl)
def response = client.get(path: "/${body}")
//def res = parseURL(url)
println "Response isn $response"
println "Url IS EXECUTED  $response.status"
if (response.status==200)
{
 def indexinfo = parseURL(url)
 println "$indexinfo"
  //def parsedJson = groovy.json.JsonOutput.toJson(response)
  println "done parse"
  println $parsedJson
  println "Url Successfully called with $response.status"
}