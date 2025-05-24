<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
android:layout_width="match_parent"
android:layout_height="match_parent"
android:orientation="vertical"
android:padding="10dp">

<TextView
android:id="@+id/tvInput"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:text="0"
android:textSize="36sp"
android:gravity="end"
android:padding="20dp"
android:background="#EEEEEE" />

<GridLayout
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:columnCount="4"
android:rowCount="5"
android:layout_marginTop="10dp">

<!-- Buttons -->
<Button android:id="@+id/btn7" android:text="7" style="@style/CalcButton"/>
<Button android:id="@+id/btn8" android:text="8" style="@style/CalcButton"/>
<Button android:id="@+id/btn9" android:text="9" style="@style/CalcButton"/>
<Button android:id="@+id/btnDiv" android:text="÷" style="@style/CalcButton"/>

<Button android:id="@+id/btn4" android:text="4" style="@style/CalcButton"/>
<Button android:id="@+id/btn5" android:text="5" style="@style/CalcButton"/>
<Button android:id="@+id/btn6" android:text="6" style="@style/CalcButton"/>
<Button android:id="@+id/btnMul" android:text="×" style="@style/CalcButton"/>

<Button android:id="@+id/btn1" android:text="1" style="@style/CalcButton"/>
<Button android:id="@+id/btn2" android:text="2" style="@style/CalcButton"/>
<Button android:id="@+id/btn3" android:text="3" style="@style/CalcButton"/>
<Button android:id="@+id/btnSub" android:text="−" style="@style/CalcButton"/>

<Button android:id="@+id/btn0" android:text="0" style="@style/CalcButton"/>
<Button android:id="@+id/btnClear" android:text="C" style="@style/CalcButton"/>
<Button android:id="@+id/btnEqual" android:text="=" style="@style/CalcButton"/>
<Button android:id="@+id/btnAdd" android:text="+" style="@style/CalcButton"/>
</GridLayout>
</LinearLayout>

