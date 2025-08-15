package defpackage;

import android.content.Context;

/* renamed from: x81  reason: default package */
public final /* synthetic */ class x81 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ moa b;

    public /* synthetic */ x81(moa moa, int i) {
        this.a = i;
        this.b = moa;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                int i = ytb.ic_reject_video_call_15;
                int i2 = wfa.R;
                Context context = (Context) this.b.a;
                return new lre(i2, context, kt3.b(context, i));
            case 1:
                int i3 = ytb.ic_reject_audio_call_12;
                int i4 = wfa.R;
                Context context2 = (Context) this.b.a;
                return new lre(i4, context2, kt3.b(context2, i3));
            case 2:
                int i5 = ytb.ic_incoming_video_call_15;
                int i6 = wfa.R;
                Context context3 = (Context) this.b.a;
                return new lre(i6, context3, kt3.b(context3, i5));
            case 3:
                int i7 = ytb.ic_incoming_audio_call_13;
                int i8 = wfa.R;
                Context context4 = (Context) this.b.a;
                return new lre(i8, context4, kt3.b(context4, i7));
            case 4:
                int i9 = ytb.ic_outgoing_video_call_15;
                int i10 = wfa.R;
                Context context5 = (Context) this.b.a;
                return new lre(i10, context5, kt3.b(context5, i9));
            case 5:
                int i11 = ytb.ic_outgoing_audio_call_13;
                int i12 = wfa.R;
                Context context6 = (Context) this.b.a;
                return new lre(i12, context6, kt3.b(context6, i11));
            default:
                int i13 = ytb.ic_link_16;
                int i14 = wfa.R;
                Context context7 = (Context) this.b.a;
                return new lre(i14, context7, kt3.b(context7, i13));
        }
    }
}
