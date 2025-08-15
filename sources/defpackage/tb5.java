package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import java.util.HashMap;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import one.me.webview.FaqWebViewWidget;

/* renamed from: tb5  reason: default package */
public final class tb5 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ FaqWebViewWidget Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tb5(FaqWebViewWidget faqWebViewWidget, Continuation continuation) {
        super(2, continuation);
        this.Z = faqWebViewWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tb5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        tb5 tb5 = new tb5(this.Z, continuation);
        tb5.Y = obj;
        return tb5;
    }

    public final Object o(Object obj) {
        sx3 sx3;
        String str;
        String str2;
        tx3 tx3 = tx3.a;
        int i = this.X;
        FaqWebViewWidget faqWebViewWidget = this.Z;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx32 = (sx3) this.Y;
            xe5 xe5 = faqWebViewWidget.X;
            this.Y = sx32;
            this.X = 1;
            Object b = xe5.b(this);
            if (b == tx3) {
                return tx3;
            }
            sx3 sx33 = sx32;
            obj = b;
            sx3 = sx33;
        } else if (i == 1) {
            sx3 = (sx3) this.Y;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str3 = (String) obj;
        str3.getClass();
        if (str3.startsWith("mailto:")) {
            int indexOf = str3.indexOf(35);
            String substring = indexOf != -1 ? str3.substring(0, indexOf) : str3;
            int indexOf2 = substring.indexOf(63);
            if (indexOf2 == -1) {
                str = Uri.decode(substring.substring(7));
                str2 = null;
            } else {
                str = Uri.decode(substring.substring(7, indexOf2));
                str2 = substring.substring(indexOf2 + 1);
            }
            HashMap hashMap = new HashMap();
            if (str2 != null) {
                for (String split : str2.split("&")) {
                    String[] split2 = split.split("=", 2);
                    if (split2.length != 0) {
                        hashMap.put(Uri.decode(split2[0]).toLowerCase(Locale.ROOT), split2.length > 1 ? Uri.decode(split2[1]) : null);
                    }
                }
            }
            String str4 = (String) hashMap.get("to");
            if (str4 != null) {
                str = rh4.j(str, ", ", str4);
            }
            hashMap.put("to", str);
            String B = z7.B(faqWebViewWidget.getContext(), ola.a);
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse(str3));
            intent.putExtra("android.intent.extra.SUBJECT", (String) hashMap.get("subject"));
            intent.putExtra("android.intent.extra.CC", (String) hashMap.get("cc"));
            intent.putExtra("android.intent.extra.TEXT", (String) hashMap.get("body"));
            try {
                faqWebViewWidget.startActivity(Intent.createChooser(intent, B));
            } catch (ActivityNotFoundException e) {
                hm9.p(sx3.getClass().getName(), "error no email app found", e);
            }
            return e5f.a;
        }
        throw new RuntimeException("Not a mailto scheme");
    }
}
