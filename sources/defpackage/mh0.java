package defpackage;

import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import java.util.List;

/* renamed from: mh0  reason: default package */
public final class mh0 extends hqd {
    public final kh0 F0 = ((kh0) dh0.a.getAccessor().c(kh0.class));
    public final xq3 G0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public mh0(android.content.Context r4, defpackage.wq3 r5) {
        /*
            r3 = this;
            dh0 r0 = defpackage.dh0.a
            v4 r0 = r0.getAccessor()
            java.lang.Class<kh0> r1 = defpackage.kh0.class
            java.lang.Object r0 = r0.c(r1)
            kh0 r0 = (defpackage.kh0) r0
            androidx.viewpager2.widget.ViewPager2 r1 = new androidx.viewpager2.widget.ViewPager2
            r1.<init>(r4)
            defpackage.fm9.z(r1)
            r3.<init>(r1)
            r3.F0 = r0
            xq3 r4 = new xq3
            r4.<init>(r5)
            r3.G0 = r4
            int r5 = defpackage.t5a.a
            r1.setId(r5)
            android.view.ViewGroup$LayoutParams r5 = new android.view.ViewGroup$LayoutParams
            r0 = -1
            r2 = -2
            r5.<init>(r0, r2)
            r1.setLayoutParams(r5)
            r1.setAdapter(r4)
            r4 = 0
            r1.setOrientation(r4)
            r5 = 2
            r1.setOffscreenPageLimit(r5)
            r1.setClipToPadding(r4)
            r1.setClipChildren(r4)
            f9 r4 = new f9
            r4.<init>(r1, r5, r3)
            r1.setPageTransformer(r4)
            lh0 r4 = new lh0
            r5 = 0
            r4.<init>(r5, r3)
            r1.b(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh0.<init>(android.content.Context, wq3):void");
    }

    /* renamed from: E */
    public final void A(ch0 ch0) {
        b bVar = new b(14, (Object) this);
        List list = ch0.b;
        this.G0.F(list, bVar);
        ViewPager2 viewPager2 = (ViewPager2) this.a;
        viewPager2.setUserInputEnabled(list.size() > 1);
        if (list.size() == 1 && ((yq3) list.get(0)).a == 1) {
            viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        }
    }
}
