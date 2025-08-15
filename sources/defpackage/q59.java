package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: q59  reason: default package */
public final /* synthetic */ class q59 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ MessagesListWidget c;

    public /* synthetic */ q59(Bundle bundle, MessagesListWidget messagesListWidget, int i) {
        this.a = i;
        this.b = bundle;
        this.c = messagesListWidget;
    }

    /* JADX WARNING: type inference failed for: r7v8, types: [qi8, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v7, types: [java.lang.Object, pz7] */
    public final Object invoke() {
        ol6 ol6;
        MessagesListWidget messagesListWidget = this.c;
        Bundle bundle = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = MessagesListWidget.X0;
                long j = bundle.getLong("ARG_CHAT_ID");
                o19 o19 = o19.a;
                khe d = o19.getAccessor().d(n4b.class);
                khe d2 = o19.getAccessor().d(vhf.class);
                MessagesListWidget messagesListWidget2 = this.c;
                return new gdf(o19.getAccessor().d(f4b.class), o19.getAccessor().d(rff.class), (w80) o19.getAccessor().c(w80.class), d, d2, j, messagesListWidget2.A0, new o59(messagesListWidget2, 4), new v59(2, messagesListWidget2, MessagesListWidget.class, "onMessageClick", "onMessageClick(JLandroid/view/View;)V", 0, 0), messagesListWidget2.getLifecycleScope());
            case 1:
                bc7[] bc7Arr2 = MessagesListWidget.X0;
                long j2 = bundle.getLong("ARG_CHAT_ID");
                long j3 = bundle.getLong("ARG_LOAD_MARK");
                long j4 = bundle.getLong("ARG_LOAD_MESSAGE_ID");
                Object obj = bundle.get("ARG_HIGHLIGHTS");
                List list = obj instanceof List ? (List) obj : null;
                if (list == null) {
                    list = nz4.a;
                }
                v69 v69 = r6;
                MessagesListWidget messagesListWidget3 = messagesListWidget;
                long j5 = j2;
                v69 v692 = new v69(j2, j3, j4, list, bundle.getBoolean("ARG_HIGHLIGHT_MESSAGE"), bundle.getBoolean("ARG_SKIP_UNREAD_DECOR"));
                o19 o192 = o19.a;
                n29 n29 = (n29) o192.getAccessor().c(n29.class);
                mg4 mg4 = mg4.REGULAR;
                n29.getClass();
                int ordinal = mg4.ordinal();
                if (ordinal == 0) {
                    ol6 = huc.s0;
                } else if (ordinal == 1) {
                    ol6 = buc.s0;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                ol6 ol62 = ol6;
                v4 v4Var = n29.a;
                Context context = (Context) v4Var.c(Context.class);
                kke kke = (kke) v4Var.c(kke.class);
                Class<iy2> cls = iy2.class;
                khe d3 = v4Var.d(cls);
                khe d4 = v4Var.d(r79.class);
                khe d5 = v4Var.d(t6b.class);
                khe d6 = v4Var.d(u9a.class);
                khe d7 = v4Var.d(ds3.class);
                ? obj2 = new Object();
                obj2.o = j5;
                obj2.a = mg4;
                obj2.b = ol62;
                obj2.c = new khe(new yf3(d3, 24, obj2));
                obj2.X = new khe(new a81(d3, d4, obj2, 5));
                yx4 yx4 = new yx4(ey8.h(j5, "MessagesListLoader#"));
                tk6 tk6 = obj2;
                khe khe = new khe(new ud2(context, v4Var, 3));
                Class<wxc> cls2 = wxc.class;
                o19 o193 = o192;
                khe khe2 = d4;
                khe khe3 = khe;
                khe khe4 = d3;
                Class<iy2> cls3 = cls;
                ix ixVar = new ix(j5, kke, mg4, ol62, d3, v4Var.d(o45.class), d6, khe2, v4Var.d(ec6.class), (wxc) v4Var.c(cls2));
                px pxVar = new px(j5, mg4, (ome) v4Var.c(ome.class), new wmc(khe4, false), (jc2) v4Var.c(jc2.class), (xb9) v4Var.c(xb9.class), ixVar, (wxc) v4Var.c(cls2));
                kke kke2 = kke;
                v19 v19 = new v19(j5, (av0) v4Var.c(av0.class), kke2);
                khe khe5 = new khe(new ud2(context, v4Var, 2));
                khe khe6 = khe3;
                m9a m9a = new m9a(khe6, khe5, d5, d7);
                khe khe7 = khe5;
                khe khe8 = khe6;
                kke kke3 = kke2;
                m9a m9a2 = m9a;
                bx bxVar = new bx(khe4, khe2, d6, v4Var.d(gb6.class), j5, kke3, yx4, v19, khe8, khe7, (ox3) v4Var.c(ox3.class), m9a2, tk6, ixVar, pxVar, (oe3) v4Var.c(oe3.class), 40, 15);
                khe d8 = o193.getAccessor().d(p7c.class);
                khe d9 = o193.getAccessor().d(cls3);
                v07 v07 = new v07((au8) o193.getAccessor().c(au8.class));
                khe d10 = o193.getAccessor().d(cea.class);
                ? obj3 = new Object();
                obj3.a = j5;
                obj3.b = pz7.class.getName();
                obj3.c = d8;
                obj3.d = d9;
                obj3.e = v07;
                obj3.f = d10;
                MessagesListWidget messagesListWidget4 = messagesListWidget3;
                return new n59(v69, (rg1) messagesListWidget4.v0.getValue(), bxVar, obj3, new y7g((k56) new p59(messagesListWidget4, 6)));
            default:
                bc7[] bc7Arr3 = MessagesListWidget.X0;
                return (n7c) messagesListWidget.createViewModelLazy(n7c.class, new jp8(2, new w21(bundle.getLong("ARG_CHAT_ID"), 4))).getValue();
        }
    }
}
