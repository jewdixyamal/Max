package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: ki5  reason: default package */
public final class ki5 implements SharedPreferences {
    public static final Object h = new Object();
    public final li5 a;
    public final fd7 b;
    public final zy c;
    public qi9 d;
    public final khe e;
    public final je7 f;
    public final Object g;

    public ki5(File file, li5 li5, mi5 mi5, fd7 fd7) {
        this.a = li5;
        this.b = fd7;
        File file2 = new File(file, w9e.L0(li5.a, ".prefs").concat(".prefs"));
        zy zyVar = new zy(file2, fd7 != null ? new q64(25, (Object) this) : null);
        this.c = zyVar;
        this.d = new qi9(10);
        this.e = new khe(new yf3(this, 10, mi5));
        this.f = tu0.r(2, new fh5(4));
        this.g = new Object();
        if (file2.exists()) {
            if (fd7 != null) {
                try {
                    fd7.G("read prefs from file");
                } catch (Throwable th) {
                    fd7 fd72 = this.b;
                    if (fd72 != null) {
                        hm9.p(((e3) fd72.a).e, "read prefs from file failure", th);
                        return;
                    }
                    return;
                }
            }
            pag.G(zyVar, new bk(9, this));
        }
    }

    public final void a(ri9 ri9, boolean z, li9 li9) {
        ri9 ri92 = ri9;
        li9 li92 = li9;
        if (ri92.d != 0) {
            if (li92.b == 0 && !z) {
                return;
            }
            if (!tpa.f(Looper.myLooper(), Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new ii5(0, this, ri9, li9, z));
                return;
            }
            char c2 = 7;
            long j = -9187201950435737472L;
            if (z) {
                Object[] objArr = ri92.b;
                long[] jArr = ri92.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j2 = jArr[i];
                        if ((((~j2) << 7) & j2 & j) != j) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((j2 & 255) < 128) {
                                    ((SharedPreferences.OnSharedPreferenceChangeListener) objArr[(i << 3) + i3]).onSharedPreferenceChanged(this, (String) null);
                                }
                                j2 >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                        j = -9187201950435737472L;
                    }
                }
            }
            Object[] objArr2 = li92.a;
            int i4 = li92.b - 1;
            while (-1 < i4) {
                String str = (String) objArr2[i4];
                Object[] objArr3 = ri92.b;
                long[] jArr2 = ri92.a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j3 = jArr2[i5];
                        if ((((~j3) << c2) & j3 & -9187201950435737472L) != -9187201950435737472L) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j3 & 255) < 128) {
                                    ((SharedPreferences.OnSharedPreferenceChangeListener) objArr3[(i5 << 3) + i7]).onSharedPreferenceChanged(this, str);
                                }
                                j3 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length2) {
                            break;
                        }
                        i5++;
                        c2 = 7;
                    }
                }
                i4--;
                c2 = 7;
            }
        }
    }

    public final boolean contains(String str) {
        return this.d.b(str);
    }

    public final SharedPreferences.Editor edit() {
        li5 li5 = this.a;
        fd7 fd7 = this.b;
        if (fd7 != null) {
            li5.getClass();
            fd7.G("edit: strategy = ".concat("BIG_CHANGES"));
        }
        li5.getClass();
        return new ji5(this);
    }

    public final Map getAll() {
        HashMap hashMap = new HashMap(this.d.e);
        qi9 qi9 = this.d;
        Object[] objArr = qi9.b;
        Object[] objArr2 = qi9.c;
        long[] jArr = qi9.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            hashMap.put((String) objArr[i4], objArr2[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return hashMap;
    }

    public final boolean getBoolean(String str, boolean z) {
        Object f2 = this.d.f(str);
        Boolean bool = f2 instanceof Boolean ? (Boolean) f2 : null;
        return bool != null ? bool.booleanValue() : z;
    }

    public final float getFloat(String str, float f2) {
        Object f3 = this.d.f(str);
        Float f4 = f3 instanceof Float ? (Float) f3 : null;
        return f4 != null ? f4.floatValue() : f2;
    }

    public final int getInt(String str, int i) {
        Object f2 = this.d.f(str);
        Integer num = f2 instanceof Integer ? (Integer) f2 : null;
        return num != null ? num.intValue() : i;
    }

    public final long getLong(String str, long j) {
        Object f2 = this.d.f(str);
        Long l = f2 instanceof Long ? (Long) f2 : null;
        return l != null ? l.longValue() : j;
    }

    public final String getString(String str, String str2) {
        Object f2 = this.d.f(str);
        String str3 = f2 instanceof String ? (String) f2 : null;
        return str3 == null ? str2 : str3;
    }

    public final Set getStringSet(String str, Set set) {
        Object f2 = this.d.f(str);
        Set set2 = f2 instanceof Set ? (Set) f2 : null;
        return set2 == null ? set : set2;
    }

    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.g) {
            ((WeakHashMap) this.f.getValue()).put(onSharedPreferenceChangeListener, h);
        }
    }

    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.g) {
            ((WeakHashMap) this.f.getValue()).remove(onSharedPreferenceChangeListener);
        }
    }
}
