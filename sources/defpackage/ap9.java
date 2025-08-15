package defpackage;

import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* renamed from: ap9  reason: default package */
public final /* synthetic */ class ap9 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NeuroAvatarsScreen b;

    public /* synthetic */ ap9(NeuroAvatarsScreen neuroAvatarsScreen, int i) {
        this.a = i;
        this.b = neuroAvatarsScreen;
    }

    public final Object invoke() {
        e5f e5f = e5f.a;
        String str = null;
        NeuroAvatarsScreen neuroAvatarsScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = NeuroAvatarsScreen.M0;
                wp9 r0 = neuroAvatarsScreen.r0();
                r0.c.a((h4d) null);
                r0.b.i.setValue((Object) null);
                return e5f;
            case 1:
                bc7[] bc7Arr2 = NeuroAvatarsScreen.M0;
                s5a p0 = neuroAvatarsScreen.p0();
                w7c w7c = neuroAvatarsScreen.r0().u0;
                j4d j4d = ((k4d) w7c.a.getValue()).a;
                l2b l2b = ((k4d) w7c.a.getValue()).b;
                h4d h4d = j4d instanceof h4d ? (h4d) j4d : null;
                Long valueOf = h4d != null ? Long.valueOf(h4d.c) : null;
                j2b j2b = l2b instanceof j2b ? (j2b) l2b : null;
                boolean f = tpa.f(valueOf, j2b != null ? Long.valueOf(j2b.b) : null);
                boolean z = true;
                boolean z2 = !f;
                i4d i4d = j4d instanceof i4d ? (i4d) j4d : null;
                String str2 = i4d != null ? i4d.a : null;
                k2b k2b = l2b instanceof k2b ? (k2b) l2b : null;
                if (k2b != null) {
                    str = k2b.a;
                }
                boolean z3 = !tpa.f(str2, str);
                if (j4d == null || (!z3 && !z2)) {
                    z = false;
                }
                p0.setCloseBadgeVisibility(z);
                return e5f;
            case 2:
                bc7[] bc7Arr3 = NeuroAvatarsScreen.M0;
                return neuroAvatarsScreen.o0() != null ? wuc.AUTH_AVATARS : wuc.SETTINGS_PROFILE_AVATARS;
            case 3:
                bc7 bc7 = NeuroAvatarsScreen.M0[11];
                afc o0 = neuroAvatarsScreen.o0();
                khe khe = new khe(new ap9(neuroAvatarsScreen, 5));
                lt7 lt7 = lt7.a;
                lt7.getClass();
                return new wp9((Long) neuroAvatarsScreen.F0.a(neuroAvatarsScreen), o0, khe, new khe(new m57(19)), new khe(new m57(16)), lt7.getAccessor().d(kke.class), lt7.getAccessor().d(gh3.class));
            case 4:
                bc7[] bc7Arr4 = NeuroAvatarsScreen.M0;
                return kt3.b(neuroAvatarsScreen.getContext(), woc.h0);
            default:
                bc7 bc72 = NeuroAvatarsScreen.M0[10];
                return new vo9((e8b) neuroAvatarsScreen.E0.a(neuroAvatarsScreen));
        }
    }
}
