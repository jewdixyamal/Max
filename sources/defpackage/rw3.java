package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* renamed from: rw3  reason: default package */
public final class rw3 extends ViewGroup.MarginLayoutParams {
    public ow3 a;
    public boolean b = false;
    public int c = 0;
    public final int d = 0;
    public final int e = -1;
    public final int f = -1;
    public final int g = 0;
    public int h = 0;
    public int i;
    public int j;
    public View k;
    public View l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final Rect q = new Rect();

    public rw3(int i2, int i3) {
        super(i2, i3);
    }

    public final boolean a(int i2) {
        if (i2 == 0) {
            return this.n;
        }
        if (i2 != 1) {
            return false;
        }
        return this.o;
    }

    public final void b(ow3 ow3) {
        ow3 ow32 = this.a;
        if (ow32 != ow3) {
            if (ow32 != null) {
                ow32.j();
            }
            this.a = ow3;
            this.b = true;
            if (ow3 != null) {
                ow3.g(this);
            }
        }
    }

    public rw3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ow3 ow3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j3c.CoordinatorLayout_Layout);
        this.c = obtainStyledAttributes.getInteger(j3c.CoordinatorLayout_Layout_android_layout_gravity, 0);
        this.f = obtainStyledAttributes.getResourceId(j3c.CoordinatorLayout_Layout_layout_anchor, -1);
        this.d = obtainStyledAttributes.getInteger(j3c.CoordinatorLayout_Layout_layout_anchorGravity, 0);
        this.e = obtainStyledAttributes.getInteger(j3c.CoordinatorLayout_Layout_layout_keyline, -1);
        this.g = obtainStyledAttributes.getInt(j3c.CoordinatorLayout_Layout_layout_insetEdge, 0);
        this.h = obtainStyledAttributes.getInt(j3c.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(j3c.CoordinatorLayout_Layout_layout_behavior);
        this.b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(j3c.CoordinatorLayout_Layout_layout_behavior);
            String str = CoordinatorLayout.G0;
            if (TextUtils.isEmpty(string)) {
                ow3 = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.G0;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.I0;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.H0);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    ow3 = (ow3) constructor.newInstance(new Object[]{context, attributeSet});
                } catch (Exception e2) {
                    throw new RuntimeException(wg0.i("Could not inflate Behavior subclass ", string), e2);
                }
            }
            this.a = ow3;
        }
        obtainStyledAttributes.recycle();
        ow3 ow32 = this.a;
        if (ow32 != null) {
            ow32.g(this);
        }
    }

    public rw3(rw3 rw3) {
        super(rw3);
    }

    public rw3(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public rw3(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
