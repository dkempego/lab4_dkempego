# SER515 Lab 4 – Dkempego

## Commit Hashes
- Activity 1 commit: 7866f11dddb7c5957d997e170b91f21af574a915 – Factory, DkempegoVehicleInspection and DkempegoMain  
- Activity 2 commit: 5089fc6c3c143bf256a6b34cf1ad8e81406856a6 – Singleton service with static DI  
- Activity 3 commit: a662d1bcbd377e5e4d8ac72359157997a751e53c – Strategy and emissions logic (Dkempego3*)  
- Activity 4 commit: 020b787388eb20ad52c7d17a118b4276f68116b5 – Added run_tests.bat to test Activities 1–3  

## Run Instructions
1. **Compile and run individually**
   `ash
   # From VisitorDesignPattern/src
   javac -d ../out *.java

   # Activity 1
   java -Dvi=asu    -cp ../out DkempegoMain
   java -Dvi=other -cp ../out DkempegoMain
   java -cp ../out DkempegoMain

   # Activity 2
   java -Dvi=asu    -cp ../out Dkempego2Main
   java -Dvi=other -cp ../out Dkempego2Main
   java -cp ../out Dkempego2Main

   # Activity 3
   java -Dvi=asu    -Des=one   -cp ../out Dkempego3Main
   java -Dvi=asu    -Des=two   -cp ../out Dkempego3Main
   java -Dvi=other  -Des=one   -cp ../out Dkempego3Main
   java -Des=other -cp ../out Dkempego3Main
