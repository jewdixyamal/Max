package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.profile.ProfileScreen;

/* renamed from: vq0  reason: default package */
public final /* synthetic */ class vq0 implements c66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vq0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        Object obj4;
        switch (this.a) {
            case 0:
                ImageView imageView = (ImageView) obj;
                ((Boolean) obj2).getClass();
                fka fka = (fka) obj3;
                int s = au1.s(((wq0) this.b).J0);
                if (s == 0) {
                    i = fka.getIcon().a.c.a;
                } else if (s == 1) {
                    i = fka.getIcon().a.c.b;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                imageView.setImageTintList(ColorStateList.valueOf(i));
                return e5f.a;
            case 1:
                return new st0(obj3, (zt0) this.b, (z3d) obj);
            case 2:
                lx3 lx3 = (lx3) obj3;
                ((m56) this.b).invoke((Throwable) obj);
                return e5f.a;
            case 3:
                long longValue = ((Long) obj).longValue();
                v5c v5c = (v5c) obj2;
                View view = (View) obj3;
                y6c y6c = ((MessagesListWidget) this.b).W0;
                if (y6c != null) {
                    Iterator it = y6c.e.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj4 = it.next();
                            v6c v6c = (v6c) obj4;
                            if (v6c.a != longValue || !tpa.f(v6c.c, v5c)) {
                            }
                        } else {
                            obj4 = null;
                        }
                    }
                    v6c v6c2 = (v6c) obj4;
                    if (v6c2 == null) {
                        String str = y6c.d;
                        ir6 ir6 = hm9.m;
                        if (ir6 != null && ir6.c()) {
                            ir6.d(us7.X, str, "Can't play reaction effect because don't have state, reaction:" + v5c + ", l:" + longValue, (Throwable) null);
                        }
                    } else {
                        dec N = y6c.a.N(v6c2.a);
                        if (y6c.f(N != null ? N.h() : -1)) {
                            String str2 = y6c.d;
                            ir6 ir62 = hm9.m;
                            if (ir62 != null && ir62.c()) {
                                ir62.d(us7.X, str2, "Make reaction effect pending, reaction:" + v5c + ", msgId:" + longValue, (Throwable) null);
                            }
                            y6c.f.add(Long.valueOf(v6c2.a));
                        } else {
                            y6c.f.remove(Long.valueOf(v6c2.a));
                            y6c.e.remove(v6c2);
                            View view2 = N.a;
                            pla.a(view2, new wxe(view2, y6c, view, v6c2, v5c, longValue));
                        }
                    }
                }
                return e5f.a;
            case 4:
                View view3 = (View) obj;
                x6g x6g = (x6g) obj2;
                Rect rect = (Rect) obj3;
                bc7[] bc7Arr = ProfileScreen.D0;
                ProfileScreen profileScreen = (ProfileScreen) this.b;
                profileScreen.getClass();
                fm fmVar = (fm) profileScreen.X.T0(profileScreen, ProfileScreen.D0[0]);
                fmVar.setPadding(fmVar.getPaddingLeft(), tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density), fmVar.getPaddingRight(), fmVar.getPaddingBottom());
                return x6g;
            default:
                Throwable th = (Throwable) obj;
                e5f e5f = (e5f) obj2;
                lx3 lx32 = (lx3) obj3;
                ((f5d) this.b).c();
                return e5f.a;
        }
    }
}
