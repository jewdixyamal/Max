package defpackage;

import android.os.Handler;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

/* renamed from: bc4  reason: default package */
public final class bc4 implements ug7 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ bc4(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void m(eh7 eh7, eg7 eg7) {
        switch (this.a) {
            case 0:
                int i = ac4.$EnumSwitchMapping$0[eg7.ordinal()];
                zb4 zb4 = (zb4) this.b;
                switch (i) {
                    case 1:
                        zb4.getClass();
                        break;
                    case 2:
                        zb4.onStart(eh7);
                        break;
                    case 3:
                        zb4.onResume(eh7);
                        break;
                    case 4:
                        zb4.onPause(eh7);
                        break;
                    case 5:
                        zb4.onStop(eh7);
                        break;
                    case 6:
                        zb4.onDestroy(eh7);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                ug7 ug7 = (ug7) this.c;
                if (ug7 != null) {
                    ug7.m(eh7, eg7);
                    return;
                }
                return;
            case 1:
                vd8 vd8 = (vd8) this.c;
                if (!vd8.X.Q()) {
                    eh7.Q().f(this);
                    w16 w16 = (w16) this.b;
                    if (((FrameLayout) w16.a).isAttachedToWindow()) {
                        vd8.H(w16);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                if (eg7 == eg7.ON_DESTROY) {
                    ((Handler) this.b).removeCallbacks((Runnable) this.c);
                    eh7.Q().f(this);
                    return;
                }
                return;
            case 3:
                if (eg7 == eg7.ON_START) {
                    ((gh7) this.b).f(this);
                    ((mm) this.c).g();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((i23) this.c).a;
                Object obj = this.b;
                i23.a((List) hashMap.get(eg7), eh7, eg7, obj);
                i23.a((List) hashMap.get(eg7.ON_ANY), eh7, eg7, obj);
                return;
        }
    }

    public bc4(Object obj) {
        this.a = 4;
        this.b = obj;
        k23 k23 = k23.c;
        Class<?> cls = obj.getClass();
        i23 i23 = (i23) k23.a.get(cls);
        this.c = i23 == null ? k23.a(cls, (Method[]) null) : i23;
    }

    public bc4(vd8 vd8, w16 w16) {
        this.a = 1;
        this.c = vd8;
        this.b = w16;
    }
}
