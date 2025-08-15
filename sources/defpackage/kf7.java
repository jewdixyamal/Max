package defpackage;

import androidx.fragment.app.FragmentWrapperWidget;
import ru.ok.messages.location.FrgLocationMap;

/* renamed from: kf7  reason: default package */
public final /* synthetic */ class kf7 implements k64 {
    public final /* synthetic */ Long X;
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ er7 c;
    public final /* synthetic */ float o;

    public /* synthetic */ kf7(long j, long j2, er7 er7, float f, Long l) {
        this.a = j;
        this.b = j2;
        this.c = er7;
        this.o = f;
        this.X = l;
    }

    public final Object a() {
        return new FragmentWrapperWidget(2050629066, FrgLocationMap.class, "ru.ok.messages.location.FrgLocationMap", dy7.g(new kpa("ru.ok.tamtam.extra.CHAT_ID", Long.valueOf(this.a)), new kpa("ru.ok.tamtam.extra.MESSAGE_ID", Long.valueOf(this.b)), new kpa("ru.ok.tamtam.extra.LOCATION", this.c), new kpa("ru.ok.tamtam.extra.ZOOM", Float.valueOf(this.o)), new kpa("ru.ok.tamtam.extra.CONTACT_ID", this.X)));
    }
}
