package defpackage;

import ru.ok.messages.media.mediabar.ActLocalMedias;

/* renamed from: b6  reason: default package */
public final class b6 implements sj3 {
    public final /* synthetic */ ActLocalMedias a;

    public b6(ActLocalMedias actLocalMedias) {
        this.a = actLocalMedias;
    }

    public final void accept(Object obj) {
        mqb mqb = (mqb) obj;
        zj9 zj9 = this.a.i1;
        zj9.getClass();
        hm9.m("zj9", "onQualitySelected: %s", mqb.toString());
        i20 a2 = zj9.t0.a();
        a2.a = mqb;
        zj9.t0 = new ref(a2);
        zj9.c2();
        zj9.d2(new iw1(1, mqb));
        zj9.d2(new uj9(zj9, 3));
        zj9.v0.g("VIDEO_UPLOAD_QUALITY_SELECTED", zj9.t0.a.name());
    }
}
