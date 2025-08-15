package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.mediarouter.app.a;
import androidx.mediarouter.app.c;
import androidx.mediarouter.app.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: uf8  reason: default package */
public final class uf8 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ d b;

    public uf8(d dVar, boolean z) {
        this.b = dVar;
        this.a = z;
    }

    public final void onGlobalLayout() {
        int i;
        HashMap hashMap;
        HashMap hashMap2;
        Bitmap bitmap;
        d dVar = this.b;
        dVar.D0.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (dVar.p1) {
            dVar.q1 = true;
            return;
        }
        int i2 = dVar.K0.getLayoutParams().height;
        d.o(dVar.K0, -1);
        dVar.u(dVar.i());
        View decorView = dVar.getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(dVar.getWindow().getAttributes().width, 1073741824), 0);
        d.o(dVar.K0, i2);
        if (!(dVar.E0.getDrawable() instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) dVar.E0.getDrawable()).getBitmap()) == null) {
            i = 0;
        } else {
            i = dVar.l(bitmap.getWidth(), bitmap.getHeight());
            dVar.E0.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
        }
        int m = dVar.m(dVar.i());
        int size = dVar.Q0.size();
        boolean n = dVar.n();
        dh8 dh8 = dVar.t0;
        int size2 = n ? Collections.unmodifiableList(dh8.u).size() * dVar.Y0 : 0;
        if (size > 0) {
            size2 += dVar.a1;
        }
        int min = Math.min(size2, dVar.Z0);
        if (!dVar.o1) {
            min = 0;
        }
        int max = Math.max(i, min) + m;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int height = rect.height() - (dVar.C0.getMeasuredHeight() - dVar.D0.getMeasuredHeight());
        if (i <= 0 || max > height) {
            if (dVar.K0.getMeasuredHeight() + dVar.O0.getLayoutParams().height >= dVar.D0.getMeasuredHeight()) {
                dVar.E0.setVisibility(8);
            }
            max = min + m;
            i = 0;
        } else {
            dVar.E0.setVisibility(0);
            d.o(dVar.E0, i);
        }
        if (!dVar.i() || max > height) {
            dVar.L0.setVisibility(8);
        } else {
            dVar.L0.setVisibility(0);
        }
        dVar.u(dVar.L0.getVisibility() == 0);
        int m2 = dVar.m(dVar.L0.getVisibility() == 0);
        int max2 = Math.max(i, min) + m2;
        if (max2 > height) {
            min -= max2 - height;
        } else {
            height = max2;
        }
        dVar.K0.clearAnimation();
        dVar.O0.clearAnimation();
        dVar.D0.clearAnimation();
        boolean z = this.a;
        if (z) {
            dVar.h(dVar.K0, m2);
            dVar.h(dVar.O0, min);
            dVar.h(dVar.D0, height);
        } else {
            d.o(dVar.K0, m2);
            d.o(dVar.O0, min);
            d.o(dVar.D0, height);
        }
        d.o(dVar.B0, rect.height());
        List unmodifiableList = Collections.unmodifiableList(dh8.u);
        if (unmodifiableList.isEmpty()) {
            dVar.Q0.clear();
            dVar.P0.notifyDataSetChanged();
        } else if (new HashSet(dVar.Q0).equals(new HashSet(unmodifiableList))) {
            dVar.P0.notifyDataSetChanged();
        } else {
            if (z) {
                OverlayListView overlayListView = dVar.O0;
                c cVar = dVar.P0;
                hashMap = new HashMap();
                int firstVisiblePosition = overlayListView.getFirstVisiblePosition();
                for (int i3 = 0; i3 < overlayListView.getChildCount(); i3++) {
                    Object item = cVar.getItem(firstVisiblePosition + i3);
                    View childAt = overlayListView.getChildAt(i3);
                    hashMap.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
                }
            } else {
                hashMap = null;
            }
            if (z) {
                OverlayListView overlayListView2 = dVar.O0;
                c cVar2 = dVar.P0;
                hashMap2 = new HashMap();
                int firstVisiblePosition2 = overlayListView2.getFirstVisiblePosition();
                for (int i4 = 0; i4 < overlayListView2.getChildCount(); i4++) {
                    Object item2 = cVar2.getItem(firstVisiblePosition2 + i4);
                    View childAt2 = overlayListView2.getChildAt(i4);
                    Bitmap createBitmap = Bitmap.createBitmap(childAt2.getWidth(), childAt2.getHeight(), Bitmap.Config.ARGB_8888);
                    childAt2.draw(new Canvas(createBitmap));
                    hashMap2.put(item2, new BitmapDrawable(dVar.u0.getResources(), createBitmap));
                }
            } else {
                hashMap2 = null;
            }
            ArrayList arrayList = dVar.Q0;
            HashSet hashSet = new HashSet(unmodifiableList);
            hashSet.removeAll(arrayList);
            dVar.R0 = hashSet;
            HashSet hashSet2 = new HashSet(dVar.Q0);
            hashSet2.removeAll(unmodifiableList);
            dVar.S0 = hashSet2;
            dVar.Q0.addAll(0, dVar.R0);
            dVar.Q0.removeAll(dVar.S0);
            dVar.P0.notifyDataSetChanged();
            if (z && dVar.o1) {
                if (dVar.S0.size() + dVar.R0.size() > 0) {
                    dVar.O0.setEnabled(false);
                    dVar.O0.requestLayout();
                    dVar.p1 = true;
                    dVar.O0.getViewTreeObserver().addOnGlobalLayoutListener(new a(dVar, hashMap, hashMap2));
                    return;
                }
            }
            dVar.R0 = null;
            dVar.S0 = null;
        }
    }
}
