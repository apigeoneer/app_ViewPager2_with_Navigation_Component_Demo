# ViewPager2 with Navigation Component Demo app

## CONCEPTS

- **Onboarding Screens (/walkthroughs):**

    These screens are displayed to the first-time users in mobile apps.

    Purpose: to introduce the app and demonstrate what it does.

- **Splash Screen :**

    It is the 1st screen of the app → user's first experience with the app. 

    Usage:  to display some animations (typically of the application logo) and illustrations while some data for the next screens are fetched.

- **Nav Graph :**

    NavGraph is a collection of [NavDestination](https://developer.android.com/reference/androidx/navigation/NavDestination) nodes fetchable by ID.

    A NavGraph serves as a 'virtual' destination: while the NavGraph itself will not appear on the back stack, navigating to the NavGraph will cause the [starting destination](https://developer.android.com/reference/androidx/navigation/NavGraph#getStartDestination()) to be added to the back stack.

- **View Pager :**

    It's a Layout manager that allows the user to flip left and right through pages of data.

    You supply an implementation of a Pager Adapter to generate the pages that the view shows.

- **Navigation Backstack :**

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## STEPS

- [x]  Create Splash Screen (Fragment)
- [x]  Create Navigation Graph
- [x]  Add NavHost Fragment
- [x]  Create ViewPager Fragment
- [x]  Create ViewPager Adapter
- [x]  Create 3 Onboarding Screens (Fragments)
- [x]  Implement the logic for ViewPagerFragment fragment
- [x]  Implement Logic for Splash Screen

    *Implement Logic for Onboarding Screens*

- [x]  Set onClickListeners on the 'next' buttons on the first 2 onboarding screens
- [x]  Navigate using the 'finish' button on the last onboarding screen
- [x]  Check if user has Completed Onboarding
- [x]  Fix Navigation Backstack

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## STEPS IN DETAIL

### 1. Create Splash Screen (Fragment & layout)

### 2. Create Nav Graph & add NavHostFragment

- Resource Manager → Navigation → + → create new nav resource file (agree to add dependencies)
- New destination → Splash fragment
- activity_main → NavHostFragment (i/s Containers)

### 3. Create ViewPagerFragment

- Create package 'onboarding'
- onboarding → ViewPagerF (Constraint Layout)
- fragment_view_pager → ViewPager2 - -search- - (agree to add dependencies) {match_parent, match_parent}

### 4. Create ViewPagerAdapter

- onboarding → ViewPagerAdapter class

### 5. Create 3 Onboarding Screens (Fragments)

- Create package screens i/s the package onboarding
- onboarding → screens → FirstFragment, SecondFragment & ThirdFragment (& layouts)

### 6. Implement the ViewPagerFragment logic

- ViewPagerF

### 7. Fixing the error w/ setting the view_pager adapter value

- Add the 'kotlin-android-extensions' plugin to your app.gradle file (after ensuring the kotlin-android plugin is added)

### 8. Implement the logic for the ViewPagerFragment fragment

- nav graph → add destination → ViewPagerF
- SplashF → Navigate to the ViewPagerF

### *Implementing logic for the onboarding screens*

### 9. Set onClickListeners on the 'next' buttons on the onboarding screens (except the last one)

- First Screen (similarly, to the Second Screen)

### 10. Navigate using the 'finish' button on the last onboarding screen

- nav graph → add destination → create & add HomeF
- Connect the ViewPagerF to the HomeF
- ViewPagerF  → Navigate to HomeFragment
- ThirdScreen fragment → Use a SharedPreferences Object to save onboarding finished value: T/F
- nav graph → connect the SplashF  w/ the HomeF
- SplashF → Use a SharedPreferences Object to check if onboarding is finished

### 11. Fix Navigation Backstack

- nav graph ⇒

    SplashF → ViewPagerF      :      popUpTo : SplashF           , popUpToInclusive : true

    SplashF → HomeF             :                      : SplashF           , " "

    ViewPagerF → HomeF       :                      : ViewPagerF    , " "
