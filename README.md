#JANAINA GOMES DA SIVA - 21944
# 21944janaina_ca1
Mobile APP CA1 - Janaina Gomes


This repository contains an introductory application for student Janaina as part of Dorset College BSc Year 2 BSc Year 2 assignment CA1

Requirements Checklist:


[x] - Main Activity (or Launcher Activity)

[x] - Button Links open new Activity

[x] - Home icon opens Main Activity from back-stack instead of creating newly

[x] - Exit Button finishes the activity and closes the app

[x] - Text is not hardcoded in the layout but is present in "strings" resources xml file

[x] - Image Assets

[x] - Images (Raster) are used

[x] - Vector icons (inbuilt material icons) are used

[x] - SVG icon is used

Layout and Design:

[x] - All text presented should be clear and legible and should have sufficient contrast (Hint: Dark Gray Text on Dark Blue background is bad)

[x] - All activities should contain ScrollViews to display lengthy content

In Main Activity, 

[x] - Basic details are centered horizontally

[x] - Photo has at least 5dp margin on all sides

[x] - 4 buttons have same length

[x] - Copyright Text, has a small font size, has dark gray color

[x] - Copyright has a top padding 10dp with a top gray border of 1dp (to separate it out from the main content)

In all 4 extra activities, 

[x] - title row is at the top of the app and does not scroll

[x] - title row has a dark background (and hence white/light colored text and icon)

[x] - button row is at the bottom of the app and does not scroll

[x] - button row has 3 buttons (or 2/1 buttons) are present in one row with at least 5dp space in between them

[x] - button row spans full width of the app (i.e. each button's width will be set based on app's width)

[x] - icon and title are displayed on top and in one row horizontally centered. Contents inside this row should be vertically aligned in the centre (while the row itself is at the top of the page)

Coding Practices (Hint: Check online if you don't know what the right/best practice is):

[x] - Variable and File Naming conventions are followed

[x] - Code is properly indented

[x] - Right File Structure is followed (e.g. Layout xml files placed directly under resources directory is bad, place it in "layout" folder instead)

Hard:
[x] - Use at least one FrameLayout as a separator e.g. to separate two LinearLayouts or TextViews (Hint: Set height 1dp with a light gray background)

[x] - Show both icons and text in buttons (except home icon)

[x] - Make ImageView display your photo with rounded corners (without editing your photo)
.
.
.
RELEASE 1: Basics

[x] - Main menu. 

[x] - 4 buttons that link the other activities. 

[x] - Text view with full name. 

[x] - Text view with intro.

[x] - Text view with contact.

[x] - Photo. 

[x] - Created an APK

[x] - Introduction of vector icons
.
.
.
Report: 

Developing this application, I basically followed what was presented in class, most of the code was directly created based on the explanations provided by the teacher.
During the creation process I had some difficulties such as:
Put a border at the top of a text: my alternative was to include an image of a line in the background that gave the appearance of a single dividing line at the top of the text.
How to use Lifecycle more effectively: despite understanding the concept of the lifecycle I decided not to add more of them, I need to study and understand the code better.
How to create circular borders in photos; The solution was to change from “ImageView” to com.google.android.material.imageview.ShapeableImageView, create an “xml” with the parameters I wanted and reference the photo through “app:shapeApperanceOverlay”
How to change the screen by clicking on the button: To solve this problem I followed the step by step taught by the teacher during the class, changing the “MainActivity”.
How to close the application with the click through the button: In this case I had to carry out an internet search that led me to a code added in the “MainActivity” that closes the application when the button is clicked.
The project was solved through testing in the design area and following the teacher's code.
.
.
.
References:

App close button:
Amaro, G., 2013. Como criar botão para sair / fechar aplicação (Android). [online] Spigando e Aprendendo. Available at: <https://spigandoeaprendendo.wordpress.com/2013/06/28/como-criar-botao-para-sair-fechar-aplicacao-android/> [Accessed 3 March 2022].

Lifecycle:
Code Palace, 2020. The Lifecycle Component Tutorial in Android Studio (Kotlin). [image] Available at: <https://www.youtube.com/watch?v=INauhIIoQ_s> [Accessed 3 March 2022].

Creating a radius corner:
Smartherd, 2020. Shape your Image with Circle, Rounded Square, Cuts at corner. Shapeable ImageView in Android Studio. [image] Available at: <https://www.youtube.com/watch?v=jihLJ0oVmGo> [Accessed 2 March 2022].

Photos used from:
Unsplash, 2022. Photos Unsplash. [image] Available at: <https://unsplash.com/> [Accessed 3 March 2022]. 

