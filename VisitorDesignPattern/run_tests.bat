@echo off
set SRC=src
set OUT=out
if not exist %OUT% mkdir %OUT%
javac -d %OUT% %SRC%\*.java

echo Activity 1 
java -Dvi=asu   -cp %OUT% DkempegoMain
java -Dvi=other -cp %OUT% DkempegoMain
java -cp %OUT% DkempegoMain

echo Activity 2
java -Dvi=asu   -cp %OUT% Dkempego2Main
java -Dvi=other -cp %OUT% Dkempego2Main
java -cp %OUT% Dkempego2Main

echo Activity 3
for %%V in (asu other "") do (
  for %%E in (one two other) do (
    echo -- vi=%%V es=%%E
    if "%%V"=="" (
      java -Des=%%E -cp %OUT% Dkempego3Main
    ) else (
      java -Dvi=%%V -Des=%%E -cp %OUT% Dkempego3Main
    )
  )
)
