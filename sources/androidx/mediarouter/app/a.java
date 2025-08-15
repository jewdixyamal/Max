package androidx.mediarouter.app;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public final class a implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Map a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ d c;

    public a(d dVar, HashMap hashMap, HashMap hashMap2) {
        this.c = dVar;
        this.a = hashMap;
        this.b = hashMap2;
    }

    public final void onGlobalLayout() {
        Map map;
        Map map2;
        coa coa;
        dh8 dh8;
        d dVar = this.c;
        dVar.O0.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        HashSet hashSet = dVar.R0;
        if (hashSet != null && dVar.S0 != null) {
            int size = hashSet.size() - dVar.S0.size();
            b bVar = new b(dVar);
            int firstVisiblePosition = dVar.O0.getFirstVisiblePosition();
            int i = 0;
            boolean z = false;
            while (true) {
                int childCount = dVar.O0.getChildCount();
                map = this.a;
                map2 = this.b;
                if (i >= childCount) {
                    break;
                }
                View childAt = dVar.O0.getChildAt(i);
                dh8 dh82 = (dh8) dVar.P0.getItem(firstVisiblePosition + i);
                Rect rect = (Rect) map.get(dh82);
                int top = childAt.getTop();
                int i2 = rect != null ? rect.top : (dVar.Y0 * size) + top;
                AnimationSet animationSet = new AnimationSet(true);
                HashSet hashSet2 = dVar.R0;
                if (hashSet2 == null || !hashSet2.contains(dh82)) {
                    dh8 = dh82;
                } else {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                    dh8 = dh82;
                    alphaAnimation.setDuration((long) dVar.s1);
                    animationSet.addAnimation(alphaAnimation);
                    i2 = top;
                }
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) (i2 - top), 0.0f);
                translateAnimation.setDuration((long) dVar.r1);
                animationSet.addAnimation(translateAnimation);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                animationSet.setInterpolator(dVar.u1);
                if (!z) {
                    animationSet.setAnimationListener(bVar);
                    z = true;
                }
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
                dh8 dh83 = dh8;
                map.remove(dh83);
                map2.remove(dh83);
                i++;
            }
            for (Map.Entry entry : map2.entrySet()) {
                dh8 dh84 = (dh8) entry.getKey();
                BitmapDrawable bitmapDrawable = (BitmapDrawable) entry.getValue();
                Rect rect2 = (Rect) map.get(dh84);
                if (dVar.S0.contains(dh84)) {
                    coa = new coa(bitmapDrawable, rect2);
                    coa.h = 1.0f;
                    coa.i = 0.0f;
                    coa.e = (long) dVar.t1;
                    coa.d = dVar.u1;
                } else {
                    coa coa2 = new coa(bitmapDrawable, rect2);
                    coa2.g = dVar.Y0 * size;
                    coa2.e = (long) dVar.r1;
                    coa2.d = dVar.u1;
                    coa2.m = new h7b((Object) dVar, 24, (Object) dh84);
                    dVar.T0.add(dh84);
                    coa = coa2;
                }
                dVar.O0.a.add(coa);
            }
        }
    }
}
