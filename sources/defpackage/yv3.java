package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.externcalls.sdk.id.ExternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.InternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.tamtam.nano.Protos;

/* renamed from: yv3  reason: default package */
public final /* synthetic */ class yv3 implements za7, qj3, dwe, InternalIdsResolver.ParticipantPrivateStateModifier, ExternalIdsResolver.ParticipantPrivateStateModifier, ru0, w56, jm7, km7 {
    public final /* synthetic */ int a;

    public /* synthetic */ yv3(int i) {
        this.a = i;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 1:
                ConversationFactory.lambda$hangup$22(obj);
                return;
            default:
                ConversationFactory.lambda$hangup$23((Throwable) obj);
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 8:
                long j = ((b04) obj).b;
                if (j == -9223372036854775807L) {
                    j = 0;
                }
                return Long.valueOf(j);
            default:
                return zw6.n(Integer.valueOf(((t13) obj).a));
        }
    }

    public String c() {
        return ConversationFactory.lambda$joinAnonByLink$15();
    }

    public su0 g(Bundle bundle) {
        int i;
        float f;
        float f2;
        int i2;
        int i3;
        boolean z;
        Bundle bundle2 = bundle;
        boolean z2 = false;
        CharSequence charSequence = bundle2.getCharSequence(Integer.toString(0, 36));
        CharSequence charSequence2 = charSequence != null ? charSequence : null;
        Layout.Alignment alignment = (Layout.Alignment) bundle2.getSerializable(Integer.toString(1, 36));
        Layout.Alignment alignment2 = alignment != null ? alignment : null;
        Layout.Alignment alignment3 = (Layout.Alignment) bundle2.getSerializable(Integer.toString(2, 36));
        Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
        Bitmap bitmap = (Bitmap) bundle2.getParcelable(Integer.toString(3, 36));
        Bitmap bitmap2 = bitmap != null ? bitmap : null;
        if (!bundle2.containsKey(Integer.toString(4, 36)) || !bundle2.containsKey(Integer.toString(5, 36))) {
            i = Integer.MIN_VALUE;
            f = -3.4028235E38f;
        } else {
            f = bundle2.getFloat(Integer.toString(4, 36));
            i = bundle2.getInt(Integer.toString(5, 36));
        }
        int i4 = bundle2.containsKey(Integer.toString(6, 36)) ? bundle2.getInt(Integer.toString(6, 36)) : Integer.MIN_VALUE;
        float f3 = bundle2.containsKey(Integer.toString(7, 36)) ? bundle2.getFloat(Integer.toString(7, 36)) : -3.4028235E38f;
        int i5 = bundle2.containsKey(Integer.toString(8, 36)) ? bundle2.getInt(Integer.toString(8, 36)) : Integer.MIN_VALUE;
        if (!bundle2.containsKey(Integer.toString(10, 36)) || !bundle2.containsKey(Integer.toString(9, 36))) {
            i2 = Integer.MIN_VALUE;
            f2 = -3.4028235E38f;
        } else {
            float f4 = bundle2.getFloat(Integer.toString(10, 36));
            i2 = bundle2.getInt(Integer.toString(9, 36));
            f2 = f4;
        }
        float f5 = bundle2.containsKey(Integer.toString(11, 36)) ? bundle2.getFloat(Integer.toString(11, 36)) : -3.4028235E38f;
        float f6 = bundle2.containsKey(Integer.toString(12, 36)) ? bundle2.getFloat(Integer.toString(12, 36)) : -3.4028235E38f;
        if (bundle2.containsKey(Integer.toString(13, 36))) {
            i3 = bundle2.getInt(Integer.toString(13, 36));
            z = true;
        } else {
            i3 = -16777216;
            z = false;
        }
        if (bundle2.getBoolean(Integer.toString(14, 36), false)) {
            z2 = z;
        }
        return new xz3(charSequence2, alignment2, alignment4, bitmap2, f, i, i4, f3, i5, i2, f2, f5, f6, z2, i3, bundle2.containsKey(Integer.toString(15, 36)) ? bundle2.getInt(Integer.toString(15, 36)) : Integer.MIN_VALUE, bundle2.containsKey(Integer.toString(16, 36)) ? bundle2.getFloat(Integer.toString(16, 36)) : 0.0f);
    }

    public void invoke(Object obj) {
        switch (this.a) {
            case 10:
                ((u65) obj).getClass();
                return;
            case 11:
                ((u65) obj).getClass();
                return;
            case Protos.Attaches.Attach.PRESENT:
                ((gd) obj).getClass();
                return;
            case 13:
                ((u65) obj).getClass();
                return;
            case Protos.Attaches.Attach.LOCATION:
                ((u65) obj).getClass();
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA:
                ((u65) obj).getClass();
                return;
            case 16:
                ((u65) obj).getClass();
                return;
            case LangUtils.HASH_SEED:
                ((gd) obj).getClass();
                return;
            case 18:
                ((u65) obj).getClass();
                return;
            case 19:
                ((u65) obj).getClass();
                return;
            case 20:
                ((gd) obj).getClass();
                return;
            case 21:
                ((u65) obj).getClass();
                return;
            case 22:
                ((u65) obj).getClass();
                return;
            case 23:
                ((u65) obj).getClass();
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                ((u65) obj).getClass();
                return;
            case 25:
                ((u65) obj).getClass();
                return;
            case 26:
                ((u65) obj).getClass();
                return;
            case 27:
                ((gd) obj).getClass();
                return;
            case 28:
                ((gd) obj).getClass();
                return;
            default:
                ((u65) obj).getClass();
                return;
        }
    }

    public Object parse(db7 db7) {
        switch (this.a) {
            case 0:
                return db7.z();
            default:
                return ConversationParams.parseCallParams(db7);
        }
    }

    public void setExternalId(ConversationParticipant conversationParticipant, ParticipantId participantId) {
        conversationParticipant.setExternalId(participantId);
    }

    public void setInternalId(ConversationParticipant conversationParticipant, bg1 bg1) {
        conversationParticipant.setInternalId(bg1);
    }

    public /* synthetic */ yv3(ed edVar, int i, long j, long j2, int i2) {
        this.a = i2;
    }

    public /* synthetic */ yv3(ed edVar, oy5 oy5, r54 r54) {
        this.a = 11;
    }

    public /* synthetic */ yv3(ed edVar, String str, long j, long j2) {
        this.a = 10;
    }

    public /* synthetic */ yv3(fd fdVar, long j) {
        this.a = 20;
    }

    public /* synthetic */ yv3(fd fdVar, Exception exc) {
        this.a = 12;
    }
}
