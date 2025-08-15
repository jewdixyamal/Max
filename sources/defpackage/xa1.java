package defpackage;

import android.content.Intent;
import android.util.Base64;
import android.view.View;
import java.nio.charset.StandardCharsets;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: xa1  reason: default package */
public final /* synthetic */ class xa1 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xa1(ya1 ya1, y21 y21, boolean z) {
        this.a = 0;
        this.c = y21;
        this.b = z;
    }

    public final Object invoke(Object obj) {
        String str = null;
        int i = 0;
        e5f e5f = e5f.a;
        boolean z = this.b;
        Object obj2 = this.c;
        switch (this.a) {
            case 0:
                Intent intent = (Intent) obj;
                intent.setAction("action-accept-call");
                y21 y21 = (y21) obj2;
                CharSequence charSequence = y21.c;
                if (charSequence == null) {
                    charSequence = null;
                }
                intent.putExtra("incoming_param_name", charSequence);
                String str2 = y21.d;
                if (str2 != null) {
                    str = Base64.encodeToString(str2.getBytes(StandardCharsets.UTF_8), 0);
                }
                intent.putExtra("incoming_param_avatar", str);
                Long l = y21.a;
                intent.putExtra("incoming_param_chat_id", l != null ? l.longValue() : 0);
                intent.putExtra("incoming_param_is_video", z);
                return e5f;
            case 1:
                ((Boolean) obj).booleanValue();
                if (!z) {
                    i = 8;
                }
                ((no1) obj2).G0.setVisibility(i);
                return e5f;
            case 2:
                bc7[] bc7Arr = rq2.f1;
                rq2 rq2 = (rq2) obj2;
                pnf.n(rq2, ((w9a) rq2.u()).b(), (vx3) null, new pp2(rq2, (View) obj, z, (Continuation) null), 2);
                return e5f;
            case 3:
                kf9 kf9 = (kf9) obj2;
                kv0 kv0 = kf9.s0;
                tpa.H((y07) obj, kf9.o, kv0.a, kv0.b, z);
                return e5f;
            default:
                int ordinal = ((yha) obj).ordinal();
                cnb cnb = (cnb) obj2;
                if (ordinal == 0 || ordinal == 1) {
                    cnb.s();
                } else {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            cnb.C(z);
                        } else if (ordinal != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    cnb.R0 = false;
                }
                return e5f;
        }
    }

    public /* synthetic */ xa1(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }
}
