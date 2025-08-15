package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.media.ChatMediaListWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* renamed from: rf2  reason: default package */
public final class rf2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMediaListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rf2(Continuation continuation, ChatMediaListWidget chatMediaListWidget) {
        super(2, continuation);
        this.Y = chatMediaListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((rf2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        rf2 rf2 = new rf2(continuation, this.Y);
        rf2.X = obj;
        return rf2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        pg2 pg2 = (pg2) this.X;
        znc znc = null;
        if (pg2 instanceof hg2) {
            ckb ckb = ckb.c;
            hg2 hg2 = (hg2) pg2;
            long j = hg2.b;
            f64 P1 = ckb.P1();
            StringBuilder k = au1.k(j, ":attach/viewer?chat_id=", "&attach_id=");
            k.append(hg2.d);
            k.append("&msg_id=");
            k.append(hg2.c);
            k.append("&single=");
            k.append(hg2.e);
            k.append("&desc=true");
            P1.b(k.toString(), (Bundle) null);
        } else if (pg2 instanceof ig2) {
            ckb ckb2 = ckb.c;
            ig2 ig2 = (ig2) pg2;
            Parcelable parcelable = ig2.b;
            ckb2.getClass();
            Bundle g = dy7.g(new kpa("message", parcelable));
            f64 P12 = ckb2.P1();
            P12.b(":attach/fullscreen?attachment_id=" + ig2.c + "&single_attach=" + ig2.d + "&desc_order=true", g);
        } else {
            boolean z = pg2 instanceof jg2;
            ChatMediaListWidget chatMediaListWidget = this.Y;
            if (z) {
                hm9.R(chatMediaListWidget.getContext(), ((jg2) pg2).b);
            } else if (pg2 instanceof kg2) {
                ckb ckb3 = ckb.c;
                kg2 kg2 = (kg2) pg2;
                long j2 = kg2.b;
                f64 P13 = ckb3.P1();
                StringBuilder k2 = au1.k(j2, ":chats?id=", "&type=local&message_id=");
                k2.append(kg2.c);
                P13.b(k2.toString(), (Bundle) null);
            } else if (pg2 instanceof mg2) {
                hm9.e0(chatMediaListWidget.getContext(), ((mg2) pg2).b);
            } else if (pg2 instanceof fg2) {
                tpa.o(chatMediaListWidget.getContext(), ((fg2) pg2).b);
            } else if (pg2 instanceof lg2) {
                ckb ckb4 = ckb.c;
                lg2 lg2 = (lg2) pg2;
                Long l = lg2.b;
                List singletonList = Collections.singletonList(new Long(lg2.c));
                if (l != null) {
                    f64 P14 = ckb4.P1();
                    String n0 = x53.n0(singletonList, ",", (String) null, (String) null, (m56) null, 62);
                    P14.b(":chats/forward?messages_ids=" + n0 + "&attach_id=" + l + "&is_forward_attach=" + lg2.d, (Bundle) null);
                } else {
                    ckb4.P1().b(":chats/forward?messages_ids=".concat(x53.n0(singletonList, ",", (String) null, (String) null, (m56) null, 62)), (Bundle) null);
                }
            } else if (pg2 instanceof gg2) {
                try {
                    chatMediaListWidget.getContext().startActivity(((gg2) pg2).b);
                } catch (Exception unused) {
                    gg2 gg2 = (gg2) pg2;
                    gg2.b.setDataAndType(gg2.c, "*/*");
                    chatMediaListWidget.getContext().startActivity(gg2.b);
                }
            } else if (pg2 instanceof ng2) {
                bc7[] bc7Arr = BottomSheetWidget.x0;
                ng2 ng2 = (ng2) pg2;
                jqe jqe = ng2.c;
                xm8 xm8 = ng2.b;
                lg3 a = od2.a(jqe, dy7.g(new kpa("selected_message_id", new Long(xm8.j())), new kpa("selected_attach_id", new Long(xm8.i()))), 4);
                a.f(ng2.d);
                for (mg3 mg3 : ng2.e) {
                    a.a(mg3);
                }
                ConfirmationBottomSheet e = a.e();
                e.setTargetController(chatMediaListWidget);
                uu3 uu3 = chatMediaListWidget;
                while (uu3.getParentController() != null) {
                    uu3 = uu3.getParentController();
                }
                foc foc = uu3 instanceof foc ? (foc) uu3 : null;
                if (foc != null) {
                    znc = foc.T();
                }
                e.z0(chatMediaListWidget);
                if (znc != null) {
                    coc coc = new coc(e, (String) null, (zu3) null, (zu3) null, false, -1);
                    wg0.l(false, coc, true, "BottomSheetWidget");
                    znc.G(coc);
                }
            } else if (pg2 instanceof og2) {
                ckb ckb5 = ckb.c;
                og2 og2 = (og2) pg2;
                long j3 = og2.b;
                ckb5.getClass();
                Uri parse = Uri.parse(og2.g);
                f64 P15 = ckb5.P1();
                Bundle g2 = dy7.g(new kpa("file_url", parse));
                y7g y7g = new y7g(13);
                y7g.b = ":dialogs/file-download-warning";
                y7g.D(Long.valueOf(j3), "chat_id");
                y7g.D(Long.valueOf(og2.c), "message_id");
                String str = og2.d;
                if (str != null) {
                    y7g.D(str, "attach_id");
                }
                y7g.D(Long.valueOf(og2.e), "file_id");
                y7g.D(og2.f, "file_name");
                P15.c(y7g.r(), g2);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return e5f.a;
    }
}
