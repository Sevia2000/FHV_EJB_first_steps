# FHV_EJB_first_steps
EJB stateless example

=> enable Glassfish 5.0 
After installation, navigate to the Glassfish installation location, more specifically to its configuration directory:

C:<your_directory>\glassfish-5.0\glassfish\config

Add this line to the asenv.bat file:

set AS_JAVA=C:<your_jdk_directory>\Java\jdk1.8.<your_most_current_jdk_version>

Additionally, add this line to the asenv.conf file:

AS_JAVA=C:<your_jdk_directory>\Java\jdk1.8.<your_most_current_jdk_version>
