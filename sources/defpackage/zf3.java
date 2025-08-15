package defpackage;

import android.content.res.Resources;
import android.graphics.Paint;
import android.os.Looper;
import android.text.BoringLayout;
import android.util.DisplayMetrics;
import androidx.work.WorkRequest;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.util.EnumMap;
import java.util.concurrent.TimeUnit;
import one.me.android.externalcallback.ExternalCallbackWidget;
import one.me.calls.ui.bottomsheet.opponent.ConfirmRemoveOpponentToCallBottomSheet;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.contactlist.ContactListWidget;
import one.me.notifications.settings.screens.dialog.DialogNotificationsSettingsScreen;
import one.me.settings.privacy.ui.pincode.EnterPinCodeScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: zf3  reason: default package */
public final /* synthetic */ class zf3 implements k56 {
    public final /* synthetic */ int a;

    public /* synthetic */ zf3(int i) {
        this.a = i;
    }

    public final Object invoke() {
        Object obj;
        Class<qea> cls = qea.class;
        e5f e5f = e5f.a;
        Object obj2 = null;
        switch (this.a) {
            case 0:
                int i = ConfirmRemoveOpponentToCallBottomSheet.B0;
                return tnd.a;
            case 1:
                kpa kpa = new kpa(zh3.b, new long[]{60000, 80000});
                kpa kpa2 = new kpa(zh3.o, new long[]{60000, 80000});
                kpa kpa3 = new kpa(zh3.X, new long[]{15000, 20000, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, 40000, 50000, 60000, 80000});
                zh3 zh3 = zh3.c;
                long[] jArr = c37.c;
                kpa[] kpaArr = {kpa, kpa2, kpa3, new kpa(zh3, jArr), new kpa(zh3.Y, jArr)};
                EnumMap enumMap = new EnumMap(zh3.class);
                for (int i2 = 0; i2 < 5; i2++) {
                    kpa kpa4 = kpaArr[i2];
                    enumMap.put((Enum) kpa4.a, kpa4.b);
                }
                return enumMap;
            case 2:
                neb neb = neb.a;
                return new a03(neb.getAccessor().d(cls), neb.getAccessor().d(o45.class));
            case 3:
                return (dfb) neb.a.getAccessor().c(dfb.class);
            case 4:
                return new pc6(neb.a.getAccessor().d(cls));
            case 5:
                bc7[] bc7Arr = ContactListWidget.P0;
                je7 je7 = iyc.a;
                return new cn3(jyc.a.getAccessor().d(y7d.class));
            case 6:
                return new zcb();
            case 7:
                return new gcb();
            case 8:
                return Boolean.FALSE;
            case 9:
                bc7[] bc7Arr2 = zt3.o;
                return e5f;
            case 10:
                return new eqe(oda.g);
            case 11:
                return new eqe(oda.h);
            case Protos.Attaches.Attach.PRESENT /*12*/:
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setDither(true);
                return paint;
            case 13:
                BoringLayout.Metrics metrics = new BoringLayout.Metrics();
                j34.E0.getFontMetricsInt(metrics);
                return metrics;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                try {
                    Field declaredField = Looper.class.getDeclaredField("sThreadLocal");
                    declaredField.setAccessible(true);
                    return (ThreadLocal) declaredField.get((Object) null);
                } catch (Throwable unused) {
                    return null;
                }
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new Object();
            case 16:
                int i3 = gj4.s0;
                return e5f;
            case LangUtils.HASH_SEED /*17*/:
                bc7[] bc7Arr3 = DialogNotificationsSettingsScreen.Y;
                return new pj4();
            case 18:
                return Resources.getSystem();
            case 19:
                return Float.valueOf(((float) DisplayMetrics.DENSITY_DEVICE_STABLE) / ((float) 160));
            case 20:
                return Float.valueOf(Math.min(fk4.d().getDisplayMetrics().density, ((Number) fk4.b.getValue()).floatValue()));
            case 21:
                return lld.a(1, 1, 2);
            case 22:
                return Long.valueOf(TimeUnit.SECONDS.toSeconds(1));
            case 23:
                return new zu4();
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return new Object();
            case 25:
                try {
                    obj = MessageDigest.getInstance("SHA-256");
                } catch (Throwable th) {
                    obj = new njc(th);
                }
                if (!(obj instanceof njc)) {
                    obj2 = obj;
                }
                return (MessageDigest) obj2;
            case 26:
                bc7[] bc7Arr4 = EnterPinCodeScreen.X;
                return new o25();
            case 27:
                int i4 = ExternalCallbackWidget.B0;
                return new t95();
            case 28:
                int i5 = ExternalCallbackWidget.B0;
                sz6 sz6 = new sz6();
                int G = tu0.G(((float) 44) * fk4.d().getDisplayMetrics().density);
                sz6.setBounds(0, 0, G, G);
                return sz6;
            default:
                return new gqd(false);
        }
    }
}
