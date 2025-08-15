package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: r96  reason: default package */
public final class r96 extends ffe implements a66 {
    public final /* synthetic */ z96 X;
    public final /* synthetic */ r4d Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r96(z96 z96, r4d r4d, Continuation continuation) {
        super(2, continuation);
        this.X = z96;
        this.Y = r4d;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((r96) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new r96(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        r4d r4d;
        int i;
        Uri uri;
        String path;
        od2.a0(obj);
        z96 z96 = this.X;
        Iterator it = ((List) z96.w0.getValue()).iterator();
        int i2 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            r4d = this.Y;
            if (!hasNext) {
                i2 = -1;
                break;
            }
            if (kp.e(((u86) it.next()).c.b, r4d.a.c())) {
                break;
            }
            i2++;
        }
        Integer num = new Integer(i2);
        if (num.intValue() < 0) {
            num = null;
        }
        e5f e5f = e5f.a;
        if (num != null) {
            int intValue = num.intValue();
            q0e q0e = z96.w0;
            u86 u86 = (u86) ((List) q0e.getValue()).get(intValue);
            awa awa = r4d.c;
            ref ref = r4d.b;
            ArrayList arrayList = new ArrayList((Collection) q0e.getValue());
            awa awa2 = r4d.c;
            Uri uri2 = awa2 != null ? awa2.X : null;
            up7 up7 = r4d.a;
            int i3 = up7.X;
            Uri uri3 = u86.l;
            if (awa.b(awa, up7)) {
                uri = awa.a(awa, up7);
                if (uri == null || (path = uri.getPath()) == null || path.equals(up7.c)) {
                    i = 0;
                } else {
                    i = 0;
                    ArrayList arrayList2 = arrayList;
                    arrayList2.set(intValue, u86.b(u86, awa, ref, uri2, 0, false, i, uri, 455));
                    q0e.m((Object) null, arrayList2);
                    ArrayList x = dy7.x(z96.F0);
                    s86 s86 = z96.Y;
                    s86.getClass();
                    pnf.o(s86.c, new m86(x));
                }
            } else {
                i = i3;
            }
            uri = uri3;
            ArrayList arrayList22 = arrayList;
            arrayList22.set(intValue, u86.b(u86, awa, ref, uri2, 0, false, i, uri, 455));
            q0e.m((Object) null, arrayList22);
            ArrayList x2 = dy7.x(z96.F0);
            s86 s862 = z96.Y;
            s862.getClass();
            pnf.o(s862.c, new m86(x2));
        }
        return e5f;
    }
}
