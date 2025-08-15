package defpackage;

import java.util.Comparator;
import one.me.devmenu.DevMenuScreen;

/* renamed from: ii4  reason: default package */
public final /* synthetic */ class ii4 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ a66 b;

    public /* synthetic */ ii4(a66 a66, int i) {
        this.a = i;
        this.b = a66;
    }

    public final int compare(Object obj, Object obj2) {
        a66 a66 = this.b;
        switch (this.a) {
            case 0:
                int i = DevMenuScreen.u0;
                return ((Number) a66.invoke(obj, obj2)).intValue();
            case 1:
                return ((Number) a66.invoke(obj, obj2)).intValue();
            default:
                return ((Number) a66.invoke(obj, obj2)).intValue();
        }
    }
}
