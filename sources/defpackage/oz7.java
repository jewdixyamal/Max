package defpackage;

import android.media.MediaCodec;
import android.net.Uri;
import android.text.TextUtils;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.google.android.gms.tasks.Task;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.util.LangUtils;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.tamtam.nano.Protos;

/* renamed from: oz7  reason: default package */
public final class oz7 implements cc3, yoe, zpa, qj3, f7b, p78, fu3 {
    public static final /* synthetic */ oz7 X = new Object();
    public static final oz7 a = new Object();
    public static final oz7 b = new Object();
    public static final oz7 c = new Object();
    public static oz7 o;

    public static final boolean c(int i) {
        int i2 = g9f.b;
        char c2 = (char) i;
        return ('a' <= c2 && c2 < '{') || ('A' <= c2 && c2 < '[') || (('0' <= c2 && c2 < ':') || c2 == '-' || c2 == '_' || c2 == '.' || c2 == '~');
    }

    public static wa1 d(String str) {
        return str.equals("action-open-call") ? sa1.a : str.equals("action-accept-call") ? na1.a : str.equals("action-finished-call") ? qa1.a : str.equals("action-decline-call") ? pa1.a : str.equals("action-open-incoming") ? ta1.a : str.equals("action-join-link") ? ra1.a : str.equals("action-microphone-state") ? oa1.a : str.equals("action-rate-call") ? ua1.a : va1.a;
    }

    public static MediaCodec e(n78 n78) {
        n78.a.getClass();
        String str = n78.a.a;
        String valueOf = String.valueOf(str);
        j47.k(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        j47.A();
        return createByCodecName;
    }

    public static int g(int i) {
        switch (i) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return 7000;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return 3062500;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return 8000;
            case 16:
                return 256000;
            case LangUtils.HASH_SEED:
                return 336000;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static o92 j(String str) {
        v25 v25 = o92.X;
        v25.getClass();
        u1 u1Var = new u1(0, v25);
        while (u1Var.hasNext()) {
            o92 o92 = (o92) u1Var.next();
            if (tpa.f(o92.a, str)) {
                return o92;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static void l(String str, String str2, String str3) {
        if (str != null && eae.o0(str, "{", false)) {
            try {
                m(new JSONObject(str), str2, str3);
            } catch (JSONException unused) {
            }
        }
    }

    public static void m(JSONObject jSONObject, String str, String str2) {
        JSONObject optJSONObject = jSONObject.optJSONObject("commands");
        if (optJSONObject != null) {
            long optLong = optJSONObject.optLong("tagShutdownMs");
            long optLong2 = optJSONObject.optLong("featureShutdownMs");
            Long valueOf = Long.valueOf(optJSONObject.optLong("globalShutdownMs"));
            Long valueOf2 = Long.valueOf(optLong2);
            Long valueOf3 = Long.valueOf(optLong);
            ky7 ky7 = new ky7();
            ju0.d(ky7, "system.shutdown.until.ts", valueOf);
            ju0.d(ky7, "system." + str + ".shutdown.until.ts", valueOf2);
            if (str2 != null) {
                ju0.d(ky7, "system." + str + '.' + str2 + ".shutdown.until.ts", valueOf3);
            }
            ky7 b2 = ky7.b();
            l7b l7b = dp3.b;
            if (l7b != null) {
                AtomicReference atomicReference = (AtomicReference) ((khe) l7b.b).getValue();
                loop0:
                while (true) {
                    Map map = (Map) atomicReference.get();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                    Iterator it = ((ly7) b2.entrySet()).iterator();
                    while (((jy7) it).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((hy7) it).next();
                        String str3 = (String) entry.getKey();
                        Object value = entry.getValue();
                        if (value == null) {
                            linkedHashMap.remove(str3);
                        } else {
                            linkedHashMap.put(str3, value);
                        }
                    }
                    while (true) {
                        if (atomicReference.compareAndSet(map, linkedHashMap)) {
                            break loop0;
                        } else if (atomicReference.get() != map) {
                        }
                    }
                }
                l7b l7b2 = dp3.b;
                if (l7b2 != null) {
                    l7b2.m();
                    return;
                }
                throw new IllegalStateException("Tracer settings are not initialized.");
            }
            throw new IllegalStateException("Tracer settings are not initialized.");
        }
    }

    public static iu8 n(int i) {
        Object obj;
        Iterator it = iu8.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((iu8) obj).a == i) {
                break;
            }
        }
        iu8 iu8 = (iu8) obj;
        if (iu8 != null) {
            return iu8;
        }
        throw new IllegalArgumentException(wg0.g(i, "No such value ", " for MessageStatus"));
    }

    public Object a(Uri uri, w24 w24) {
        return Long.valueOf(oaf.V(new BufferedReader(new InputStreamReader(w24)).readLine()));
    }

    public void accept(Object obj) {
        j47.Z(new OnErrorNotImplementedException((Throwable) obj));
    }

    public int b(int i, CharSequence charSequence) {
        int i2 = 0;
        boolean z = false;
        while (true) {
            char c2 = 2;
            if (i2 >= i) {
                return z ? 1 : 2;
            }
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            zoe zoe = bpe.a;
            if (directionality == 0) {
                c2 = 1;
            } else if (directionality == 1 || directionality == 2) {
                c2 = 0;
            }
            if (c2 == 0) {
                return 0;
            }
            if (c2 == 1) {
                z = true;
            }
            i2++;
        }
    }

    public Object f(bg4 bg4) {
        return nd7.s((Executor) bg4.f(new lqb(le0.class, Executor.class)));
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [k1, java.lang.Object, bm7] */
    public bm7 h(qh8 qh8, oh8 oh8, List list) {
        ArrayList<tb8> arrayList = new ArrayList<>(z53.S(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tb8 tb8 = (tb8) it.next();
            ib8 ib8 = tb8.b;
            if (ib8 != null) {
                ya8 a2 = tb8.a();
                a2.g = ay7.G(ib8.a, tb8).toString();
                tb8 = a2.a();
            }
            arrayList.add(tb8);
        }
        for (tb8 tb82 : arrayList) {
            if (tb82.b == null) {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                ? obj = new Object();
                obj.m(unsupportedOperationException);
                return obj;
            }
        }
        return fm9.F(arrayList);
    }

    public r78 i(n78 n78) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = e(n78);
            j47.k("configureCodec");
            mediaCodec.configure(n78.b, n78.d, n78.e, 0);
            j47.A();
            j47.k("startCodec");
            mediaCodec.start();
            j47.A();
            return new pl8(mediaCodec);
        } catch (IOException | RuntimeException e) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        }
    }

    public CharSequence k(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        listPreference.getClass();
        if (!TextUtils.isEmpty((CharSequence) null)) {
            return null;
        }
        return listPreference.a.getString(y1c.not_set);
    }

    public /* synthetic */ Object u(Task task) {
        qz7 qz7 = reg.w0;
        return null;
    }
}
