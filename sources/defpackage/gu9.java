package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: gu9  reason: default package */
public final class gu9 extends pu9 {
    public final int e;
    public final kua f;
    public final PendingIntent g;
    public final PendingIntent h;
    public final PendingIntent i;

    public gu9(int i2, kua kua, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3) {
        if (!TextUtils.isEmpty(kua.a)) {
            this.e = i2;
            this.f = kua;
            this.g = pendingIntent3;
            this.h = pendingIntent2;
            this.i = pendingIntent;
            return;
        }
        throw new IllegalArgumentException("person must have a non-empty a name");
    }

    public final void a(Bundle bundle) {
        super.a(bundle);
        bundle.putInt("android.callType", this.e);
        bundle.putBoolean("android.callIsVideo", false);
        kua kua = this.f;
        if (kua != null) {
            bundle.putParcelable("android.callPerson", eu9.b(jua.b(kua)));
        }
        bundle.putCharSequence("android.verificationText", (CharSequence) null);
        bundle.putParcelable("android.answerIntent", this.g);
        bundle.putParcelable("android.declineIntent", this.h);
        bundle.putParcelable("android.hangUpIntent", this.i);
    }

    public final void b(m5d m5d) {
        Notification.CallStyle callStyle;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = this.e;
        kua kua = this.f;
        Notification.Builder builder = (Notification.Builder) m5d.c;
        CharSequence charSequence = null;
        if (i2 >= 31) {
            PendingIntent pendingIntent = this.g;
            if (i3 != 1) {
                PendingIntent pendingIntent2 = this.i;
                if (i3 == 2) {
                    kua.getClass();
                    callStyle = fu9.b(jua.b(kua), pendingIntent2);
                } else if (i3 != 3) {
                    if (Log.isLoggable("NotifCompat", 3)) {
                        String.valueOf(i3);
                    }
                    callStyle = null;
                } else {
                    kua.getClass();
                    callStyle = fu9.c(jua.b(kua), pendingIntent2, pendingIntent);
                }
            } else {
                kua.getClass();
                callStyle = fu9.a(jua.b(kua), this.h, pendingIntent);
            }
            if (callStyle != null) {
                callStyle.setBuilder(builder);
                fu9.i(callStyle, (CharSequence) null);
                fu9.g(callStyle, false);
                return;
            }
            return;
        }
        builder.setContentTitle(kua != null ? kua.a : null);
        Bundle bundle = ((bu9) this.b).w;
        CharSequence charSequence2 = (bundle == null || !bundle.containsKey("android.text")) ? null : ((bu9) this.b).w.getCharSequence("android.text");
        if (charSequence2 == null) {
            if (i3 == 1) {
                charSequence = ((bu9) this.b).a.getResources().getString(r0c.call_notification_incoming_text);
            } else if (i3 == 2) {
                charSequence = ((bu9) this.b).a.getResources().getString(r0c.call_notification_ongoing_text);
            } else if (i3 == 3) {
                charSequence = ((bu9) this.b).a.getResources().getString(r0c.call_notification_screening_text);
            }
            charSequence2 = charSequence;
        }
        builder.setContentText(charSequence2);
        if (kua != null) {
            IconCompat iconCompat = kua.b;
            if (iconCompat != null) {
                du9.c(builder, cs6.d(iconCompat, ((bu9) this.b).a));
            }
            eu9.a(builder, jua.b(kua));
        }
        cu9.b(builder, "call");
    }

    public final String e() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }

    public final nt9 p(int i2, int i3, int i4, PendingIntent pendingIntent) {
        Integer valueOf = Integer.valueOf(lt3.a(((bu9) this.b).a, i4));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(((bu9) this.b).a.getResources().getString(i3));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(valueOf.intValue()), 0, spannableStringBuilder.length(), 18);
        nt9 a = new mt9(IconCompat.c(((bu9) this.b).a, i2), spannableStringBuilder, pendingIntent, new Bundle()).a();
        a.a.putBoolean("key_action_priority", true);
        return a;
    }
}
