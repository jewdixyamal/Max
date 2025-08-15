package defpackage;

import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.coroutines.Continuation;
import one.me.inviteactions.invitebyqr.InviteByQrBottomSheet;

/* renamed from: d67  reason: default package */
public final class d67 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ InviteByQrBottomSheet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d67(InviteByQrBottomSheet inviteByQrBottomSheet, Continuation continuation) {
        super(2, continuation);
        this.Y = inviteByQrBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((d67) n((iqb) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        d67 d67 = new d67(this.Y, continuation);
        d67.X = obj;
        return d67;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        iqb iqb = (iqb) this.X;
        InviteByQrBottomSheet inviteByQrBottomSheet = this.Y;
        InviteByQrBottomSheet.A0(inviteByQrBottomSheet).setText(iqb.a);
        q7c q7c = inviteByQrBottomSheet.A0;
        CharSequence charSequence = iqb.b;
        if (charSequence == null || w9e.C0(charSequence)) {
            InviteByQrBottomSheet.B0(inviteByQrBottomSheet).setVisibility(8);
            ((LinearLayout.LayoutParams) InviteByQrBottomSheet.A0(inviteByQrBottomSheet).getLayoutParams()).topMargin = tu0.G(((float) 27) * fk4.d().getDisplayMetrics().density);
            ((LinearLayout.LayoutParams) ((AppCompatImageView) q7c.T0(inviteByQrBottomSheet, InviteByQrBottomSheet.G0[2])).getLayoutParams()).topMargin = tu0.G(((float) 15) * fk4.d().getDisplayMetrics().density);
        } else {
            InviteByQrBottomSheet.B0(inviteByQrBottomSheet).setVisibility(0);
            float f = (float) 18;
            ((LinearLayout.LayoutParams) InviteByQrBottomSheet.A0(inviteByQrBottomSheet).getLayoutParams()).topMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
            ((LinearLayout.LayoutParams) ((AppCompatImageView) q7c.T0(inviteByQrBottomSheet, InviteByQrBottomSheet.G0[2])).getLayoutParams()).topMargin = tu0.G(f * fk4.d().getDisplayMetrics().density);
        }
        InviteByQrBottomSheet.B0(inviteByQrBottomSheet).setText(charSequence);
        ((AppCompatImageView) q7c.T0(inviteByQrBottomSheet, InviteByQrBottomSheet.G0[2])).setImageBitmap(iqb.c);
        return e5f.a;
    }
}
