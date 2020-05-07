package com.example.recyclerview

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.core.view.marginBottom
import androidx.recyclerview.widget.RecyclerView

class DividerItemDecoration: RecyclerView.ItemDecoration() {

    override fun onDraw(c: Canvas, parent: RecyclerView, state: RecyclerView.State) {
        super.onDraw(c, parent, state)

        val mDivider = 10

        val childCount = parent.getChildCount()

        val mPaint =  Paint()

        mPaint.strokeWidth = 3f

        mPaint.color = Color.GRAY

        mPaint.style = Paint.Style.STROKE

        for(i in 0 until childCount){

            val child = parent.getChildAt(i)

            val params: ViewGroup.MarginLayoutParams = child.layoutParams as ViewGroup.MarginLayoutParams

            val left = parent.getPaddingLeft()

            val top = child.getBottom() + params.bottomMargin

            val right = parent.getWidth() - parent.getPaddingRight()

            val bottom = top + mDivider

            c.drawRect(left.toFloat(),top.toFloat(),right.toFloat(),bottom.toFloat(),mPaint)

        }

   }
}