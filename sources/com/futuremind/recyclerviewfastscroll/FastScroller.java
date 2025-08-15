package com.futuremind.recyclerviewfastscroll;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class FastScroller extends LinearLayout {
    public static final /* synthetic */ int B0 = 0;
    public gxc A0;
    public final r15 a = new r15(this);
    public RecyclerView b;
    public View c;
    public View o;
    public TextView s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public int y0;
    public boolean z0;

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r4v3, types: [gxc, java.lang.Object] */
    public FastScroller(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setClipChildren(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a3c.fastscroll__fastScroller, usb.fastscroll__style, 0);
        try {
            this.v0 = obtainStyledAttributes.getColor(a3c.fastscroll__fastScroller_fastscroll__bubbleColor, -1);
            this.u0 = obtainStyledAttributes.getColor(a3c.fastscroll__fastScroller_fastscroll__handleColor, -1);
            this.w0 = obtainStyledAttributes.getResourceId(a3c.fastscroll__fastScroller_fastscroll__bubbleTextAppearance, -1);
            obtainStyledAttributes.recycle();
            this.y0 = getVisibility();
            setViewProvider(new Object());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    public void setRecyclerViewPosition(float f) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int j = recyclerView.getAdapter().j();
            float max = Math.max(0.0f, (float) ((int) (f * ((float) j))));
            this.b.x0((int) Math.min(max, (float) (j - 1)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005c, code lost:
        if ((r3.b.getAdapter().j() * r3.b.getChildAt(0).getWidth()) <= r3.b.getWidth()) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003e, code lost:
        if ((r3.b.getAdapter().j() * r3.b.getChildAt(0).getHeight()) <= r3.b.getHeight()) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r3 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            hdc r0 = r0.getAdapter()
            if (r0 == 0) goto L_0x0068
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            hdc r0 = r0.getAdapter()
            int r0 = r0.j()
            if (r0 == 0) goto L_0x0068
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            r1 = 0
            android.view.View r0 = r0.getChildAt(r1)
            if (r0 == 0) goto L_0x0068
            boolean r0 = r3.c()
            if (r0 == 0) goto L_0x0041
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            android.view.View r0 = r0.getChildAt(r1)
            int r0 = r0.getHeight()
            androidx.recyclerview.widget.RecyclerView r2 = r3.b
            hdc r2 = r2.getAdapter()
            int r2 = r2.j()
            int r2 = r2 * r0
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            int r0 = r0.getHeight()
            if (r2 > r0) goto L_0x005f
            goto L_0x0068
        L_0x0041:
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            android.view.View r0 = r0.getChildAt(r1)
            int r0 = r0.getWidth()
            androidx.recyclerview.widget.RecyclerView r2 = r3.b
            hdc r2 = r2.getAdapter()
            int r2 = r2.j()
            int r2 = r2 * r0
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            int r0 = r0.getWidth()
            if (r2 > r0) goto L_0x005f
            goto L_0x0068
        L_0x005f:
            int r0 = r3.y0
            if (r0 == 0) goto L_0x0064
            goto L_0x0068
        L_0x0064:
            super.setVisibility(r1)
            goto L_0x006c
        L_0x0068:
            r0 = 4
            super.setVisibility(r0)
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.futuremind.recyclerviewfastscroll.FastScroller.b():void");
    }

    public final boolean c() {
        return this.x0 == 1;
    }

    public gxc getViewProvider() {
        return this.A0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005b, code lost:
        r3 = r0.o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0044, code lost:
        r3 = r0.s0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        /*
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            android.view.View r1 = r0.o
            yb5 r2 = new yb5
            r3 = 0
            r2.<init>(r3, r0)
            r1.setOnTouchListener(r2)
            gxc r1 = r0.A0
            ld4 r1 = (defpackage.ld4) r1
            com.futuremind.recyclerviewfastscroll.FastScroller r2 = r1.a
            boolean r2 = r2.c()
            r3 = 1073741824(0x40000000, float:2.0)
            if (r2 == 0) goto L_0x002d
            android.view.View r2 = r1.d
            int r2 = r2.getHeight()
            float r2 = (float) r2
            float r2 = r2 / r3
            android.view.View r1 = r1.c
            int r1 = r1.getHeight()
        L_0x002a:
            float r1 = (float) r1
            float r2 = r2 - r1
            goto L_0x003c
        L_0x002d:
            android.view.View r2 = r1.d
            int r2 = r2.getWidth()
            float r2 = (float) r2
            float r2 = r2 / r3
            android.view.View r1 = r1.c
            int r1 = r1.getWidth()
            goto L_0x002a
        L_0x003c:
            int r1 = (int) r2
            r0.t0 = r1
            int r1 = r0.v0
            r2 = -1
            if (r1 == r2) goto L_0x0057
            android.widget.TextView r3 = r0.s0
            android.graphics.drawable.Drawable r4 = r3.getBackground()
            if (r4 != 0) goto L_0x004d
            goto L_0x0057
        L_0x004d:
            android.graphics.drawable.Drawable r5 = r4.mutate()
            defpackage.aq4.g(r5, r1)
            r3.setBackground(r4)
        L_0x0057:
            int r1 = r0.u0
            if (r1 == r2) goto L_0x006e
            android.view.View r3 = r0.o
            android.graphics.drawable.Drawable r4 = r3.getBackground()
            if (r4 != 0) goto L_0x0064
            goto L_0x006e
        L_0x0064:
            android.graphics.drawable.Drawable r5 = r4.mutate()
            defpackage.aq4.g(r5, r1)
            r3.setBackground(r4)
        L_0x006e:
            int r1 = r0.w0
            if (r1 == r2) goto L_0x0077
            android.widget.TextView r2 = r0.s0
            r2.setTextAppearance(r1)
        L_0x0077:
            boolean r1 = r0.isInEditMode()
            if (r1 != 0) goto L_0x0084
            r15 r1 = r0.a
            androidx.recyclerview.widget.RecyclerView r0 = r0.b
            r1.c(r0)
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.futuremind.recyclerviewfastscroll.FastScroller.onLayout(boolean, int, int, int, int):void");
    }

    public void setBubbleColor(int i) {
        this.v0 = i;
        invalidate();
    }

    public void setBubbleTextAppearance(int i) {
        this.w0 = i;
        invalidate();
    }

    public void setHandleColor(int i) {
        this.u0 = i;
        invalidate();
    }

    public void setOrientation(int i) {
        this.x0 = i;
        super.setOrientation(i == 0 ? 1 : 0);
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.b = recyclerView;
        recyclerView.getAdapter();
        recyclerView.m(this.a);
        b();
        recyclerView.setOnHierarchyChangeListener(new qw3(1, this));
    }

    public void setScrollerPosition(float f) {
        if (c()) {
            this.c.setY(Math.min(Math.max(0.0f, (((float) (getHeight() - this.o.getHeight())) * f) + ((float) this.t0)), (float) (getHeight() - this.c.getHeight())));
            this.o.setY(Math.min(Math.max(0.0f, f * ((float) (getHeight() - this.o.getHeight()))), (float) (getHeight() - this.o.getHeight())));
            return;
        }
        this.c.setX(Math.min(Math.max(0.0f, (((float) (getWidth() - this.o.getWidth())) * f) + ((float) this.t0)), (float) (getWidth() - this.c.getWidth())));
        this.o.setX(Math.min(Math.max(0.0f, f * ((float) (getWidth() - this.o.getWidth()))), (float) (getWidth() - this.o.getWidth())));
    }

    public void setViewProvider(gxc gxc) {
        removeAllViews();
        this.A0 = gxc;
        gxc.a = this;
        ld4 ld4 = (ld4) gxc;
        int i = 0;
        View inflate = LayoutInflater.from(ld4.a.getContext()).inflate(wyb.fastscroll__default_bubble, this, false);
        ld4.c = inflate;
        this.c = inflate;
        ld4.d = new View(ld4.a.getContext());
        int dimensionPixelSize = ld4.a.c() ? 0 : ld4.a.getContext().getResources().getDimensionPixelSize(ttb.fastscroll__handle_inset);
        if (ld4.a.c()) {
            i = ld4.a.getContext().getResources().getDimensionPixelSize(ttb.fastscroll__handle_inset);
        }
        int i2 = i;
        ld4.d.setBackground(new InsetDrawable(kt3.b(ld4.a.getContext(), zub.fastscroll__default_handle), i2, dimensionPixelSize, i2, dimensionPixelSize));
        ld4.d.setLayoutParams(new ViewGroup.LayoutParams(ld4.a.getContext().getResources().getDimensionPixelSize(ld4.a.c() ? ttb.fastscroll__handle_clickable_width : ttb.fastscroll__handle_height), ld4.a.getContext().getResources().getDimensionPixelSize(ld4.a.c() ? ttb.fastscroll__handle_height : ttb.fastscroll__handle_clickable_width)));
        this.o = ld4.d;
        this.s0 = (TextView) ld4.c;
        addView(this.c);
        addView(this.o);
    }

    public void setVisibility(int i) {
        this.y0 = i;
        b();
    }
}
