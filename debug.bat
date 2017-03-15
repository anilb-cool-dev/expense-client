@if "%trace%"=="" echo off
if "%OS%" == "Windows_NT" setlocal

set JPDA_TRANSPORT=dt_socket
set JPDA_ADDRESS=5005
set JPDA_SUSPEND=n
set JPDA_OPTS=-Xdebug -Xrunjdwp:transport=%JPDA_TRANSPORT%,address=%JPDA_ADDRESS%,server=y,suspend=%JPDA_SUSPEND%

call %CATALINA_HOME%\bin\catalina.bat jpda start %CMD_LINE_ARGS%