package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.util.Size;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.webrtc.MediaStreamTrack;

/* renamed from: tfg  reason: default package */
public abstract class tfg {
    public static hgf a;
    public static final o97 b = new o97("PERFORMANCE_METRICS", 1);
    public static final /* synthetic */ int c = 0;
    public static Integer d;
    public static Integer e;
    public static ScheduledExecutorService f;
    public static gta g;

    public static void A(String str, boolean z, q33 q33) {
        if (z) {
            ((t33) q33).m("app.chat.background.dark.id", str);
        } else {
            ((t33) q33).m("app.chat.background.light.id", str);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r1v24, types: [qb8] */
    /* JADX WARNING: type inference failed for: r1v25, types: [jb8] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List B(one.me.messages.list.loader.MessageModel r13) {
        /*
            tz r0 = r13.u0
            o00 r0 = r0.d
            boolean r1 = r0 instanceof defpackage.x38
            nz4 r2 = defpackage.nz4.a
            if (r1 != 0) goto L_0x000f
            boolean r1 = r0 instanceof defpackage.zf5
            if (r1 != 0) goto L_0x000f
            return r2
        L_0x000f:
            boolean r1 = r0 instanceof defpackage.f53
            if (r1 == 0) goto L_0x0068
            r1 = r0
            f53 r1 = (defpackage.f53) r1
            java.util.List r1 = r1.b
            java.util.ArrayList r10 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.z53.S(r1, r2)
            r10.<init>(r2)
            java.util.Iterator r11 = r1.iterator()
        L_0x0027:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0065
            java.lang.Object r1 = r11.next()
            a53 r1 = (defpackage.a53) r1
            boolean r2 = r1 instanceof defpackage.yt6
            if (r2 == 0) goto L_0x0049
            jb8 r12 = new jb8
            r7 = r1
            yt6 r7 = (defpackage.yt6) r7
            long r4 = r7.a
            long r2 = r13.a
            r8 = 0
            r9 = 48
            r1 = r12
            r6 = r0
            r1.<init>(r2, r4, r6, r7, r8, r9)
            goto L_0x005b
        L_0x0049:
            boolean r2 = r1 instanceof defpackage.wcf
            if (r2 == 0) goto L_0x005f
            qb8 r12 = new qb8
            r7 = r1
            wcf r7 = (defpackage.wcf) r7
            long r4 = r7.a
            long r2 = r13.a
            r1 = r12
            r6 = r0
            r1.<init>(r2, r4, r6, r7)
        L_0x005b:
            r10.add(r12)
            goto L_0x0027
        L_0x005f:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x0065:
            r2 = r10
            goto L_0x00d5
        L_0x0068:
            boolean r1 = r0 instanceof defpackage.vqd
            if (r1 == 0) goto L_0x0084
            jb8 r10 = new jb8
            r1 = r0
            vqd r1 = (defpackage.vqd) r1
            yt6 r7 = r1.c
            long r4 = r7.a
            long r2 = r13.a
            r8 = 0
            r9 = 48
            r1 = r10
            r6 = r0
            r1.<init>(r2, r4, r6, r7, r8, r9)
            java.util.List r2 = java.util.Collections.singletonList(r10)
            goto L_0x00d5
        L_0x0084:
            boolean r1 = r0 instanceof defpackage.bsd
            if (r1 == 0) goto L_0x009d
            qb8 r8 = new qb8
            r1 = r0
            bsd r1 = (defpackage.bsd) r1
            wcf r7 = r1.c
            long r4 = r7.a
            long r2 = r13.a
            r1 = r8
            r6 = r0
            r1.<init>(r2, r4, r6, r7)
            java.util.List r2 = java.util.Collections.singletonList(r8)
            goto L_0x00d5
        L_0x009d:
            boolean r1 = r0 instanceof defpackage.zf5
            if (r1 == 0) goto L_0x00d5
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r1 = r0
            zf5 r1 = (defpackage.zf5) r1
            yt6 r7 = r1.k
            if (r7 == 0) goto L_0x00c0
            jb8 r11 = new jb8
            long r2 = r13.a
            long r4 = r7.a
            java.lang.String r8 = r1.c
            r9 = 16
            r1 = r11
            r6 = r0
            r1.<init>(r2, r4, r6, r7, r8, r9)
            r10.add(r11)
            goto L_0x0065
        L_0x00c0:
            wcf r7 = r1.l
            if (r7 == 0) goto L_0x0065
            qb8 r9 = new qb8
            long r2 = r13.a
            long r4 = r7.a
            java.lang.String r8 = r1.c
            r1 = r9
            r6 = r0
            r1.<init>(r2, r4, r6, r7, r8)
            r10.add(r9)
            goto L_0x0065
        L_0x00d5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tfg.B(one.me.messages.list.loader.MessageModel):java.util.List");
    }

    public static final void C(y5f y5f) {
        y5f.e(an9.class, new k1e(1));
        y5f.e(w1e.class, new k1e(2));
        y5f.e(tg1.class, new k1e(3));
        y5f.e(ax7.class, new k1e(4));
        y5f.e(ita.class, new k1e(5));
        y5f.e(aua.class, new k1e(6));
        y5f.e(kh0.class, new k1e(7));
        y5f.e(bt1.class, new k1e(8));
        y5f.e(vsf.class, new k1e(9));
        y5f.e(iwf.class, new txc(29));
        y5f.e(it8.class, new k1e(0));
    }

    public static final void D(y5f y5f) {
        y5f.c(b64.class, new lxc(22));
        y5f.e(aa7.class, new ybf(2));
        y5f.e(y83.class, new ybf(3));
        y5f.e(gc6.class, new mxc(7));
        y5f.e(uc6.class, new mxc(8));
        y5f.e(ysf.class, new mxc(9));
        Class<pi4> cls = pi4.class;
        y5f.c(cls, new lxc(23));
        Class<ia7> cls2 = ia7.class;
        y5f.c(cls2, new lxc(24));
        y5f.c(cls2, new lxc(25));
        y5f.c(cls2, new lxc(26));
        y5f.c(cls2, new lxc(27));
        y5f.c(cls2, new lxc(28));
        y5f.c(cls, new lxc(29));
        y5f.c(cls2, new xsf(0));
        y5f.c(cls, new lxc(21));
    }

    public static final b10 a(int i) {
        switch (e8f.$EnumSwitchMapping$0[au1.s(i)]) {
            case 1:
                return b10.UNKNOWN;
            case 2:
                return b10.VIDEO;
            case 3:
                return b10.VIDEO_MSG;
            case 4:
            case 5:
                return b10.PHOTO;
            case 6:
                return b10.FILE;
            case 7:
                return b10.AUDIO;
            case 8:
                return b10.STICKER;
            default:
                return b10.UNKNOWN;
        }
    }

    public static void b(Context context, l20 l20, e2b e2b, boolean z, boolean z2) {
        jic v;
        Object obj;
        Object obj2;
        Object obj3 = e2b.e;
        if (obj3 == null || ((wv6) obj3).i == null) {
            jic v2 = v(context, l20, z);
            if (!(v2 == null || (obj2 = e2b.e) == null)) {
                xv6 b2 = xv6.b((wv6) obj2);
                b2.d = v2;
                e2b.e = b2.a();
            }
            if (!z && z2 && (v = v(context, l20, true)) != null && (obj = e2b.e) != null) {
                xv6 b3 = xv6.b((wv6) obj);
                b3.d = v;
                e2b.f = b3.a();
            }
        }
    }

    public static final String c(long j) {
        long hours = TimeUnit.MILLISECONDS.toHours(j);
        long j2 = j - (3600000 * hours);
        long j3 = j2 / 60000;
        long j4 = (j2 - (60000 * j3)) / ((long) 1000);
        if (hours > 0) {
            return String.format(hours + ":%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j4)}, 2));
        }
        return String.format(j3 + ":%02d", Arrays.copyOf(new Object[]{Long.valueOf(j4)}, 1));
    }

    public static final String d(long j) {
        long hours = TimeUnit.MILLISECONDS.toHours(j);
        long j2 = j - (3600000 * hours);
        long j3 = j2 / 60000;
        long j4 = (long) 1000;
        long j5 = (j2 - (60000 * j3)) / j4;
        long j6 = (j % j4) / ((long) 10);
        if (hours <= 0) {
            return String.format("%02d:%02d,%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j5), Long.valueOf(j6)}, 3));
        }
        return String.format(hours + ":%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j5), Long.valueOf(j6)}, 3));
    }

    public static String e(String str) {
        if (oag.t(str) || ".".equals(str) || "..".equals(str)) {
            return "(invalid)";
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if ((charAt >= 0 && charAt <= 31) || charAt == '\"' || charAt == '*' || charAt == '/' || charAt == ':' || charAt == '<' || charAt == '\\' || charAt == '|' || charAt == 127 || charAt == '>' || charAt == '?') {
                sb.append('_');
            } else {
                sb.append(charAt);
            }
        }
        byte[] bytes = sb.toString().getBytes(StandardCharsets.UTF_8);
        if (bytes.length > 255) {
            while (bytes.length > 252) {
                sb.deleteCharAt(sb.length() / 2);
                bytes = sb.toString().getBytes(StandardCharsets.UTF_8);
            }
            sb.insert(sb.length() / 2, "...");
        }
        return sb.toString();
    }

    public static final String f(Long l, Long l2) {
        int compareTo = l2.compareTo(l);
        return compareTo > 0 ? "<" : compareTo < 0 ? ">" : "=";
    }

    public static final int i(int i, Object obj) {
        return (i * 31) + (obj != null ? obj.hashCode() : 0);
    }

    public static String[] j(fw4 fw4) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        int i;
        long j6;
        long j7;
        long j8;
        long j9;
        char c2;
        long j10;
        long j11;
        long j12;
        short s;
        long j13;
        long j14;
        long j15;
        long j16;
        fw4 fw42 = fw4;
        int i2 = 8;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long w = w(fw42, allocate, 0);
        if (w == 1179403647) {
            z(fw42, allocate, 1, 4);
            boolean z = ((short) (allocate.get() & 255)) == 1;
            z(fw42, allocate, 1, 5);
            if (((short) (allocate.get() & 255)) == 2) {
                allocate.order(ByteOrder.BIG_ENDIAN);
            }
            if (z) {
                j = w(fw42, allocate, 28);
            } else {
                z(fw42, allocate, 8, 32);
                j = allocate.getLong();
            }
            if (z) {
                z(fw42, allocate, 2, 44);
                j2 = (long) (allocate.getShort() & 65535);
            } else {
                z(fw42, allocate, 2, 56);
                j2 = (long) (allocate.getShort() & 65535);
            }
            z(fw42, allocate, 2, z ? 42 : 54);
            short s2 = allocate.getShort() & 65535;
            if (j2 == 65535) {
                if (z) {
                    j16 = w(fw42, allocate, 32);
                } else {
                    z(fw42, allocate, 8, 40);
                    j16 = allocate.getLong();
                }
                j2 = z ? w(fw42, allocate, j16 + 28) : w(fw42, allocate, j16 + 44);
            }
            long j17 = j;
            long j18 = 0;
            while (true) {
                if (j18 >= j2) {
                    j3 = 0;
                    break;
                }
                if ((z ? w(fw42, allocate, j17) : w(fw42, allocate, j17)) != 2) {
                    j17 += (long) s2;
                    j18++;
                } else if (z) {
                    j3 = w(fw42, allocate, j17 + 4);
                } else {
                    z(fw42, allocate, 8, j17 + 8);
                    j3 = allocate.getLong();
                }
            }
            if (j3 != 0) {
                long j19 = j3;
                int i3 = 0;
                long j20 = 0;
                while (true) {
                    if (z) {
                        j4 = w(fw42, allocate, j19);
                    } else {
                        z(fw42, allocate, i2, j19);
                        j4 = allocate.getLong();
                    }
                    char c3 = 65535;
                    if (j4 != 1) {
                        j5 = j3;
                        if (j4 == 5) {
                            if (z) {
                                j15 = w(fw42, allocate, j19 + 4);
                            } else {
                                z(fw42, allocate, 8, j19 + 8);
                                j15 = allocate.getLong();
                            }
                            j20 = j15;
                        }
                    } else if (i3 != Integer.MAX_VALUE) {
                        i3++;
                        j5 = j3;
                    } else {
                        throw new UnsatisfiedLinkError("malformed DT_NEEDED section");
                    }
                    j19 += z ? 8 : 16;
                    if (j4 != 0) {
                        long j21 = j2;
                        long j22 = j20;
                        j2 = j21;
                        j3 = j5;
                        i2 = 8;
                    } else if (j20 != 0) {
                        long j23 = j;
                        int i4 = 0;
                        while (true) {
                            if (((long) i4) >= j2) {
                                i = i3;
                                j6 = 0;
                                j7 = 0;
                                break;
                            }
                            if ((z ? w(fw42, allocate, j23) : w(fw42, allocate, j23)) == 1) {
                                if (z) {
                                    j11 = j2;
                                    j12 = w(fw42, allocate, j23 + 8);
                                } else {
                                    j11 = j2;
                                    z(fw42, allocate, 8, j23 + 16);
                                    j12 = allocate.getLong();
                                }
                                if (z) {
                                    j13 = w(fw42, allocate, j23 + 20);
                                    s = s2;
                                    i = i3;
                                } else {
                                    s = s2;
                                    i = i3;
                                    z(fw42, allocate, 8, j23 + 40);
                                    j13 = allocate.getLong();
                                }
                                if (j12 > j20 || j20 >= j13 + j12) {
                                    s2 = s;
                                } else {
                                    if (z) {
                                        j14 = w(fw42, allocate, j23 + 4);
                                    } else {
                                        z(fw42, allocate, 8, j23 + 8);
                                        j14 = allocate.getLong();
                                    }
                                    j7 = j14 + (j20 - j12);
                                    j6 = 0;
                                }
                            } else {
                                i = i3;
                                j11 = j2;
                            }
                            j23 += (long) s2;
                            i4++;
                            i3 = i;
                            j2 = j11;
                        }
                        if (j7 != j6) {
                            int i5 = i;
                            String[] strArr = new String[i5];
                            long j24 = j5;
                            int i6 = 0;
                            while (true) {
                                if (z) {
                                    j8 = w(fw42, allocate, j24);
                                } else {
                                    z(fw42, allocate, 8, j24);
                                    j8 = allocate.getLong();
                                }
                                if (j8 == 1) {
                                    if (z) {
                                        j10 = w(fw42, allocate, j24 + 4);
                                    } else {
                                        z(fw42, allocate, 8, j24 + 8);
                                        j10 = allocate.getLong();
                                    }
                                    long j25 = j10 + j7;
                                    StringBuilder sb = new StringBuilder();
                                    while (true) {
                                        long j26 = j25 + 1;
                                        j9 = j7;
                                        z(fw42, allocate, 1, j25);
                                        short s3 = (short) (allocate.get() & 255);
                                        if (s3 == 0) {
                                            break;
                                        }
                                        sb.append((char) s3);
                                        j25 = j26;
                                        j7 = j9;
                                    }
                                    strArr[i6] = sb.toString();
                                    c2 = 65535;
                                    if (i6 != Integer.MAX_VALUE) {
                                        i6++;
                                    } else {
                                        throw new UnsatisfiedLinkError("malformed DT_NEEDED section");
                                    }
                                } else {
                                    j9 = j7;
                                    c2 = c3;
                                }
                                j24 += z ? 8 : 16;
                                if (j8 != 0) {
                                    c3 = c2;
                                    j7 = j9;
                                } else if (i6 == i5) {
                                    return strArr;
                                } else {
                                    throw new UnsatisfiedLinkError("malformed DT_NEEDED section");
                                }
                            }
                        } else {
                            throw new UnsatisfiedLinkError("did not find file offset of DT_STRTAB table");
                        }
                    } else {
                        throw new UnsatisfiedLinkError("Dynamic section string-table not found");
                    }
                }
            } else {
                throw new UnsatisfiedLinkError("ELF file does not contain dynamic linking information");
            }
        } else {
            throw new UnsatisfiedLinkError("file is not ELF: magic is 0x" + Long.toHexString(w) + ", it should be " + Long.toHexString(1179403647));
        }
    }

    public static String k(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments == null || pathSegments.size() <= 2) {
            return null;
        }
        String str = pathSegments.get(0);
        if (oag.t(str) || !str.equalsIgnoreCase("external_files")) {
            return null;
        }
        Uri.Builder buildUpon = Uri.fromFile(Environment.getExternalStorageDirectory()).buildUpon();
        for (int i = 1; i < pathSegments.size(); i++) {
            buildUpon.appendPath(pathSegments.get(i));
        }
        String path = buildUpon.build().getPath();
        if (pag.l(path)) {
            return path;
        }
        return null;
    }

    public static String l(q33 q33, boolean z) {
        return z ? ((t33) q33).g.getString("app.chat.background.dark.id", (String) null) : ((t33) q33).g.getString("app.chat.background.light.id", (String) null);
    }

    public static final int m(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex("`" + str + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        return -1;
    }

    public static final int n(Cursor cursor, String str) {
        String str2;
        int m = m(cursor, str);
        if (m >= 0) {
            return m;
        }
        try {
            str2 = ys.j0(cursor.getColumnNames(), (String) null, 63);
        } catch (Exception unused) {
            str2 = "unknown";
        }
        throw new IllegalArgumentException(rh4.k("column '", str, "' does not exist. Available columns: ", str2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0063, code lost:
        if (r10 != null) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0065, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007a, code lost:
        if (r10 != null) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007d, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String o(android.content.Context r10, android.net.Uri r11, java.lang.String r12, java.lang.String[] r13) {
        /*
            java.lang.String r0 = "file://"
            java.lang.String r1 = java.util.Arrays.toString(r13)
            java.lang.Object[] r1 = new java.lang.Object[]{r11, r12, r1}
            java.lang.String r2 = "getDataColumn: uri = %s, selection = %s, selection args = %s"
            java.lang.String r3 = "tfg"
            defpackage.hm9.m(r3, r2, r1)
            java.lang.String r1 = "_data"
            java.lang.String[] r6 = new java.lang.String[]{r1}
            r2 = 0
            android.content.ContentResolver r4 = r10.getContentResolver()     // Catch:{ Exception -> 0x006b, all -> 0x0069 }
            r9 = 0
            r5 = r11
            r7 = r12
            r8 = r13
            android.database.Cursor r10 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x006b, all -> 0x0069 }
            if (r10 == 0) goto L_0x0063
            boolean r12 = r10.moveToFirst()     // Catch:{ Exception -> 0x005d }
            if (r12 == 0) goto L_0x0063
            int r12 = r10.getColumnIndexOrThrow(r1)     // Catch:{ Exception -> 0x005d }
            java.lang.String r12 = r10.getString(r12)     // Catch:{ Exception -> 0x005d }
            boolean r13 = defpackage.oag.t(r12)     // Catch:{ Exception -> 0x005d }
            if (r13 == 0) goto L_0x003e
            r10.close()
            return r2
        L_0x003e:
            java.lang.String r13 = "/"
            boolean r13 = r12.startsWith(r13)     // Catch:{ Exception -> 0x005d }
            if (r13 == 0) goto L_0x004a
            r10.close()
            return r12
        L_0x004a:
            boolean r13 = r12.startsWith(r0)     // Catch:{ Exception -> 0x005d }
            if (r13 == 0) goto L_0x005f
            java.lang.String r13 = ""
            java.lang.String r11 = r12.replace(r0, r13)     // Catch:{ Exception -> 0x005d }
            r10.close()
            return r11
        L_0x005a:
            r11 = move-exception
            r2 = r10
            goto L_0x007e
        L_0x005d:
            r12 = move-exception
            goto L_0x006d
        L_0x005f:
            r10.close()
            return r2
        L_0x0063:
            if (r10 == 0) goto L_0x007d
        L_0x0065:
            r10.close()
            goto L_0x007d
        L_0x0069:
            r11 = move-exception
            goto L_0x007e
        L_0x006b:
            r12 = move-exception
            r10 = r2
        L_0x006d:
            java.lang.String r13 = "getDataColumn: error for uri = %s, e = %s"
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x005a }
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r12}     // Catch:{ all -> 0x005a }
            defpackage.hm9.q(r3, r13, r11)     // Catch:{ all -> 0x005a }
            if (r10 == 0) goto L_0x007d
            goto L_0x0065
        L_0x007d:
            return r2
        L_0x007e:
            if (r2 == 0) goto L_0x0083
            r2.close()
        L_0x0083:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tfg.o(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static int p(Context context) {
        if (e == null) {
            ((y8a) vl.b()).f().getClass();
            Size i = ti4.i(context);
            int min = (int) ((((float) Math.min(i.getWidth(), i.getHeight())) / 3.0f) * 2.0f);
            if (min < 400) {
                min = 400;
            }
            e = Integer.valueOf(min);
        }
        return e.intValue();
    }

    public static String q(String str) {
        try {
            MimeTypeMap singleton = MimeTypeMap.getSingleton();
            int lastIndexOf = str.lastIndexOf(46);
            if (lastIndexOf == -1) {
                return null;
            }
            String substring = str.substring(lastIndexOf + 1);
            String mimeTypeFromExtension = singleton.getMimeTypeFromExtension(substring.toLowerCase());
            return (!oag.t(mimeTypeFromExtension) || oag.t(substring)) ? mimeTypeFromExtension : "application/".concat(substring);
        } catch (Exception e2) {
            hm9.o("tfg", "getMimeTypeFromFileName: failed, e: " + e2.toString());
            return null;
        }
    }

    public static String r(Context context, Uri uri, yx4 yx4) {
        try {
            String uri2 = uri.toString();
            try {
                String path = uri.getPath();
                if (!oag.t(path)) {
                    File file = new File(path);
                    if (file.exists()) {
                        hm9.m("tfg", "getPath: from file: " + uri2, new Object[0]);
                        return file.getAbsolutePath();
                    }
                } else {
                    hm9.m("tfg", "getPath: path from uri.getPath is empty, uri = %s", uri2);
                }
                File file2 = new File(uri.toString());
                if (file2.exists()) {
                    hm9.m("tfg", "getPath: from file: " + uri2, new Object[0]);
                    return file2.getAbsolutePath();
                }
            } catch (Exception e2) {
                hm9.p("tfg", "getPath: error check file exists", e2);
            }
            char c2 = 65535;
            if (uri2.contains("com.google.android.apps.photos.contentprovider")) {
                try {
                    String str = uri2.split("/1/")[1];
                    int indexOf = str.indexOf("/ACTUAL");
                    if (indexOf != -1) {
                        uri = Uri.parse(URLDecoder.decode(str.substring(0, indexOf), StandardCharsets.UTF_8));
                    }
                } catch (Exception e3) {
                    hm9.p("tfg", "getPath: error on get google photos uri", e3);
                }
            }
            if (DocumentsContract.isDocumentUri(context, uri)) {
                if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
                    hm9.m("tfg", "getPath: is external document: " + uri, new Object[0]);
                    String[] split = DocumentsContract.getDocumentId(uri).split(":");
                    if ("primary".equalsIgnoreCase(split[0])) {
                        return Environment.getExternalStorageDirectory() + "/" + split[1];
                    }
                } else if ("com.android.providers.downloads.documents".equals(uri.getAuthority())) {
                    hm9.m("tfg", "getPath: is download document: " + uri, new Object[0]);
                    String documentId = DocumentsContract.getDocumentId(uri);
                    if (oag.t(documentId) || !documentId.toLowerCase().startsWith("raw:")) {
                        return o(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), (String) null, (String[]) null);
                    }
                    String substring = documentId.substring(4);
                    if (pag.l(substring)) {
                        return substring;
                    }
                    return null;
                } else if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
                    hm9.m("tfg", "getPath: is media document: " + uri, new Object[0]);
                    String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                    String str2 = split2[0];
                    int hashCode = str2.hashCode();
                    if (hashCode != 93166550) {
                        if (hashCode != 100313435) {
                            if (hashCode == 112202875) {
                                if (str2.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                                    c2 = 1;
                                }
                            }
                        } else if (str2.equals("image")) {
                            c2 = 0;
                        }
                    } else if (str2.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                        c2 = 2;
                    }
                    return o(context, c2 != 0 ? c2 != 1 ? c2 != 2 ? null : MediaStore.Audio.Media.EXTERNAL_CONTENT_URI : MediaStore.Video.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id=?", new String[]{split2[1]});
                }
            } else if ("content".equalsIgnoreCase(uri.getScheme())) {
                String authority = uri.getAuthority();
                if (!oag.t(authority) && authority.equalsIgnoreCase(yx4.a)) {
                    hm9.m("tfg", "getPath: from application content scheme: " + uri, new Object[0]);
                    String k = k(uri);
                    if (!oag.t(k)) {
                        return k;
                    }
                }
                hm9.m("tfg", "getPath: from content scheme: " + uri, new Object[0]);
                return o(context, uri, (String) null, (String[]) null);
            } else if ("file".equalsIgnoreCase(uri.getScheme())) {
                hm9.m("tfg", "getPath: from file scheme: " + uri, new Object[0]);
                return uri.getPath();
            }
        } catch (Exception e4) {
            hm9.q("tfg", "getPath: error for uri %s, e: %s", uri, e4.toString());
        }
        return null;
    }

    public static final gta s(Context context) {
        gta gta = g;
        if (gta != null) {
            return gta;
        }
        gta gta2 = new gta(context.getApplicationContext());
        g = gta2;
        return gta2;
    }

    public static jic t(Context context, int i, int i2, boolean z) {
        int i3;
        int p = p(context);
        if (d == null) {
            ((y8a) vl.b()).f().getClass();
            Size i4 = ti4.i(context);
            d = Integer.valueOf(Math.max(i4.getWidth(), i4.getHeight()));
        }
        int intValue = d.intValue();
        if (z) {
            intValue = p;
        }
        if (i2 * i < intValue * intValue) {
            return null;
        }
        if (i2 <= intValue && i <= intValue) {
            return null;
        }
        if (i2 > i) {
            int i5 = (int) ((((float) i) / ((float) i2)) * ((float) intValue));
            i3 = intValue;
            intValue = i5;
        } else {
            i3 = (int) ((((float) i2) / ((float) i)) * ((float) intValue));
        }
        return new jic(intValue, z ? (float) p : 2048.0f, i3);
    }

    public static jic u(Context context, k20 k20, boolean z) {
        int i;
        int i2 = k20.e;
        int i3 = k20.f;
        jic t = t(context, i2, i3, z);
        if (t == null && (i = k20.e) > 0 && i3 > 0) {
            t = new jic(i, z ? (float) p(context) : 2048.0f, i3);
        }
        return t;
    }

    public static jic v(Context context, l20 l20, boolean z) {
        g20 g20 = l20.a;
        if (g20 == g20.Z) {
            c20 c20 = l20.g;
            if (c20.a()) {
                return v(context, c20.g, z);
            }
            x10 x10 = c20.f;
            if (x10 != null) {
                return t(context, x10.c, x10.o, z);
            }
        } else if (g20 == g20.c) {
            x10 x102 = l20.b;
            return t(context, x102.c, x102.o, z);
        } else {
            boolean N = s5c.N(l20);
            s10 s10 = l20.j;
            if (!N) {
                if (l20.a == g20.o) {
                    return u(context, l20.d, z);
                }
                if (s5c.P(l20)) {
                    return u(context, s10.d.d, z);
                }
            } else if (!z) {
                return null;
            } else {
                x10 x103 = s10.d.b;
                return t(context, x103.c, x103.o, z);
            }
        }
        return null;
    }

    public static long w(fw4 fw4, ByteBuffer byteBuffer, long j) {
        z(fw4, byteBuffer, 4, j);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0106, code lost:
        if (r0.contains(r10.getFilesDir().getParent()) == false) goto L_0x011f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean x(android.net.Uri r9, android.content.Context r10, defpackage.o45 r11) {
        /*
            java.lang.String r0 = r9.getPath()
            boolean r1 = defpackage.oag.t(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000d
            goto L_0x011f
        L_0x000d:
            r1 = r2
        L_0x000e:
            r3 = 1
            r4 = 10
            java.lang.String r5 = "/"
            if (r1 >= r4) goto L_0x0045
            boolean r4 = defpackage.oag.t(r0)
            if (r4 == 0) goto L_0x001d
            r6 = r0
            goto L_0x003a
        L_0x001d:
            java.lang.String[] r4 = r0.split(r5)
            int r6 = r4.length
            if (r6 <= 0) goto L_0x0027
            r6 = r4[r2]
            goto L_0x0029
        L_0x0027:
            java.lang.String r6 = ""
        L_0x0029:
            r7 = r3
        L_0x002a:
            int r8 = r4.length
            if (r7 >= r8) goto L_0x003a
            r8 = r4[r7]
            java.lang.String r6 = defpackage.rh4.j(r6, r5, r8)
            java.lang.String r6 = android.system.Os.readlink(r6)     // Catch:{ Exception -> 0x0037 }
        L_0x0037:
            int r7 = r7 + 1
            goto L_0x002a
        L_0x003a:
            boolean r4 = r0.equals(r6)
            if (r4 == 0) goto L_0x0041
            goto L_0x0046
        L_0x0041:
            int r1 = r1 + 1
            r0 = r6
            goto L_0x000e
        L_0x0045:
            r0 = 0
        L_0x0046:
            if (r0 != 0) goto L_0x004a
            goto L_0x0108
        L_0x004a:
            boolean r1 = defpackage.oag.t(r0)
            if (r1 == 0) goto L_0x0052
            goto L_0x00dc
        L_0x0052:
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0060 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0060 }
            java.lang.String r1 = r1.getCanonicalPath()     // Catch:{ Exception -> 0x0060 }
            if (r1 == 0) goto L_0x00dc
            r0 = r1
            goto L_0x00dc
        L_0x0060:
            boolean r1 = defpackage.oag.t(r0)
            if (r1 == 0) goto L_0x0068
            goto L_0x00dc
        L_0x0068:
            java.lang.String r1 = "/./"
            java.lang.String r0 = r0.replace(r1, r5)
        L_0x006e:
            java.lang.String r1 = "//"
            java.lang.String r1 = r0.replace(r1, r5)
            boolean r4 = r0.equals(r1)
            if (r4 == 0) goto L_0x0120
            java.lang.String[] r0 = r0.split(r5)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r4 = r0.length
            if (r4 <= 0) goto L_0x008b
            r4 = r0[r2]
            r1.add(r4)
        L_0x008b:
            r4 = r3
        L_0x008c:
            int r6 = r0.length
            if (r4 >= r6) goto L_0x00ae
            r6 = r0[r4]
            java.lang.String r7 = ".."
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x00a8
            int r7 = r1.size()
            if (r7 <= 0) goto L_0x00a8
            int r6 = r1.size()
            int r6 = r6 - r3
            r1.remove(r6)
            goto L_0x00ab
        L_0x00a8:
            r1.add(r6)
        L_0x00ab:
            int r4 = r4 + 1
            goto L_0x008c
        L_0x00ae:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r4 = r1.size()
            if (r4 <= 0) goto L_0x00c2
            java.lang.Object r4 = r1.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
        L_0x00c2:
            r4 = r3
        L_0x00c3:
            int r6 = r1.size()
            if (r4 >= r6) goto L_0x00d8
            r0.append(r5)
            java.lang.Object r6 = r1.get(r4)
            java.lang.String r6 = (java.lang.String) r6
            r0.append(r6)
            int r4 = r4 + 1
            goto L_0x00c3
        L_0x00d8:
            java.lang.String r0 = r0.toString()
        L_0x00dc:
            boolean r1 = defpackage.oag.t(r0)
            if (r1 != 0) goto L_0x011f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "/data/data/"
            r1.<init>(r4)
            java.lang.String r4 = r10.getPackageName()
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L_0x0108
            java.io.File r10 = r10.getFilesDir()
            java.lang.String r10 = r10.getParent()
            boolean r10 = r0.contains(r10)
            if (r10 == 0) goto L_0x011f
        L_0x0108:
            if (r11 == 0) goto L_0x011e
            ru.ok.tamtam.util.HandledException r10 = new ru.ok.tamtam.util.HandledException
            java.lang.String r9 = r9.toString()
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r0 = "Uri is internal: %s"
            r10.<init>(r0, r9)
            cba r11 = (defpackage.cba) r11
            r11.c(r10, r3)
        L_0x011e:
            return r3
        L_0x011f:
            return r2
        L_0x0120:
            r0 = r1
            goto L_0x006e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tfg.x(android.net.Uri, android.content.Context, o45):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v59, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v68, resolved type: java.lang.String} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.n7d y(defpackage.gy8 r26) {
        /*
            r1 = r26
            java.lang.String r2 = "payloadCatching catch error"
            java.lang.String r3 = "ServerPayload/PayloadCatching"
            r5 = 1
            int r0 = defpackage.lz7.N(r26)     // Catch:{ all -> 0x000d }
            r6 = r0
            goto L_0x003d
        L_0x000d:
            r0 = move-exception
            r6 = r0
            defpackage.hm9.l0(r3, r2, r6)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x002b
            java.lang.Object r7 = r0.next()
            r4a r7 = (defpackage.r4a) r7
            r7.getClass()
            defpackage.r4a.a(r6)
            goto L_0x0018
        L_0x002b:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x003c
            if (r0 == r5) goto L_0x003b
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x003b:
            throw r6
        L_0x003c:
            r6 = 0
        L_0x003d:
            r7 = 0
            if (r6 != 0) goto L_0x0041
            return r7
        L_0x0041:
            nz4 r8 = defpackage.nz4.a
            r9 = 0
            r15 = r7
            r18 = r15
            r19 = r18
            r16 = r8
            r17 = r16
            r13 = r9
            r20 = r13
            r11 = 0
        L_0x0052:
            if (r11 >= r6) goto L_0x030e
            java.lang.String r0 = defpackage.lz7.P(r26)     // Catch:{ all -> 0x0059 }
            goto L_0x0089
        L_0x0059:
            r0 = move-exception
            r12 = r0
            defpackage.hm9.l0(r3, r2, r12)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0064:
            boolean r22 = r0.hasNext()
            if (r22 == 0) goto L_0x0077
            java.lang.Object r22 = r0.next()
            r4a r22 = (defpackage.r4a) r22
            r22.getClass()
            defpackage.r4a.a(r12)
            goto L_0x0064
        L_0x0077:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x0088
            if (r0 == r5) goto L_0x0087
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0087:
            throw r12
        L_0x0088:
            r0 = r7
        L_0x0089:
            if (r0 != 0) goto L_0x008d
            goto L_0x0309
        L_0x008d:
            int r12 = r0.hashCode()
            r4 = 7
            switch(r12) {
                case -2072608278: goto L_0x028f;
                case -1307828855: goto L_0x0248;
                case -8339209: goto L_0x01db;
                case 98494: goto L_0x0190;
                case 3556653: goto L_0x014d;
                case 538738099: goto L_0x00df;
                case 1094519557: goto L_0x0097;
                default: goto L_0x0095;
            }
        L_0x0095:
            goto L_0x0297
        L_0x0097:
            java.lang.String r4 = "replyTo"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x00a1
            goto L_0x0297
        L_0x00a1:
            long r23 = defpackage.lz7.M(r1, r9)     // Catch:{ all -> 0x00ad }
            java.lang.Long r0 = java.lang.Long.valueOf(r23)     // Catch:{ all -> 0x00ad }
            r18 = r0
            goto L_0x0309
        L_0x00ad:
            r0 = move-exception
            defpackage.hm9.l0(r3, r2, r0)
            java.util.concurrent.CopyOnWriteArraySet r4 = defpackage.u7d.a
            java.util.Iterator r4 = r4.iterator()
        L_0x00b7:
            boolean r12 = r4.hasNext()
            if (r12 == 0) goto L_0x00ca
            java.lang.Object r12 = r4.next()
            r4a r12 = (defpackage.r4a) r12
            r12.getClass()
            defpackage.r4a.a(r0)
            goto L_0x00b7
        L_0x00ca:
            int r4 = defpackage.k7d.a
            int r4 = defpackage.au1.s(r4)
            if (r4 == 0) goto L_0x00db
            if (r4 == r5) goto L_0x00da
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00da:
            throw r0
        L_0x00db:
            r18 = r7
            goto L_0x0309
        L_0x00df:
            java.lang.String r12 = "attaches"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x00e9
            goto L_0x0297
        L_0x00e9:
            av8 r0 = r26.n()     // Catch:{ all -> 0x0115 }
            int r0 = r0.a()     // Catch:{ all -> 0x0115 }
            if (r0 != r4) goto L_0x010a
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0115 }
            r0.<init>()     // Catch:{ all -> 0x0115 }
            int r4 = r26.s0()     // Catch:{ all -> 0x0115 }
            r12 = 0
        L_0x00fd:
            if (r12 >= r4) goto L_0x010e
            bz r7 = defpackage.bz.b(r26)     // Catch:{ all -> 0x0115 }
            r0.add(r7)     // Catch:{ all -> 0x0115 }
            int r12 = r12 + 1
            r7 = 0
            goto L_0x00fd
        L_0x010a:
            r26.z()     // Catch:{ all -> 0x0115 }
            r0 = 0
        L_0x010e:
            if (r0 == 0) goto L_0x0117
            java.util.List r0 = defpackage.x53.e0(r0)     // Catch:{ all -> 0x0115 }
            goto L_0x0118
        L_0x0115:
            r0 = move-exception
            goto L_0x011c
        L_0x0117:
            r0 = r8
        L_0x0118:
            r16 = r0
            goto L_0x0309
        L_0x011c:
            defpackage.hm9.l0(r3, r2, r0)
            java.util.concurrent.CopyOnWriteArraySet r4 = defpackage.u7d.a
            java.util.Iterator r4 = r4.iterator()
        L_0x0125:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0138
            java.lang.Object r7 = r4.next()
            r4a r7 = (defpackage.r4a) r7
            r7.getClass()
            defpackage.r4a.a(r0)
            goto L_0x0125
        L_0x0138:
            int r4 = defpackage.k7d.a
            int r4 = defpackage.au1.s(r4)
            if (r4 == 0) goto L_0x0149
            if (r4 == r5) goto L_0x0148
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0148:
            throw r0
        L_0x0149:
            r16 = r8
            goto L_0x0309
        L_0x014d:
            java.lang.String r4 = "text"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0157
            goto L_0x0297
        L_0x0157:
            java.lang.String r0 = defpackage.lz7.P(r26)     // Catch:{ all -> 0x015e }
            r15 = r0
            goto L_0x0309
        L_0x015e:
            r0 = move-exception
            r4 = r0
            defpackage.hm9.l0(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0169:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x017c
            java.lang.Object r7 = r0.next()
            r4a r7 = (defpackage.r4a) r7
            r7.getClass()
            defpackage.r4a.a(r4)
            goto L_0x0169
        L_0x017c:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x018d
            if (r0 == r5) goto L_0x018c
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x018c:
            throw r4
        L_0x018d:
            r15 = 0
            goto L_0x0309
        L_0x0190:
            java.lang.String r4 = "cid"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x019a
            goto L_0x0297
        L_0x019a:
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            long r12 = defpackage.lz7.M(r1, r9)     // Catch:{ all -> 0x01a7 }
            java.lang.Long r4 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x01a7 }
            goto L_0x01d5
        L_0x01a7:
            r0 = move-exception
            defpackage.hm9.l0(r3, r2, r0)
            java.util.concurrent.CopyOnWriteArraySet r7 = defpackage.u7d.a
            java.util.Iterator r7 = r7.iterator()
        L_0x01b1:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L_0x01c4
            java.lang.Object r12 = r7.next()
            r4a r12 = (defpackage.r4a) r12
            r12.getClass()
            defpackage.r4a.a(r0)
            goto L_0x01b1
        L_0x01c4:
            int r7 = defpackage.k7d.a
            int r7 = defpackage.au1.s(r7)
            if (r7 == 0) goto L_0x01d5
            if (r7 == r5) goto L_0x01d4
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01d4:
            throw r0
        L_0x01d5:
            long r13 = r4.longValue()
            goto L_0x0309
        L_0x01db:
            java.lang.String r7 = "elements"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x01e5
            goto L_0x0297
        L_0x01e5:
            av8 r0 = r26.n()     // Catch:{ all -> 0x0210 }
            int r0 = r0.a()     // Catch:{ all -> 0x0210 }
            if (r0 != r4) goto L_0x0205
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0210 }
            r0.<init>()     // Catch:{ all -> 0x0210 }
            int r4 = r26.s0()     // Catch:{ all -> 0x0210 }
            r7 = 0
        L_0x01f9:
            if (r7 >= r4) goto L_0x0209
            lu8 r12 = defpackage.ku8.a(r26)     // Catch:{ all -> 0x0210 }
            r0.add(r12)     // Catch:{ all -> 0x0210 }
            int r7 = r7 + 1
            goto L_0x01f9
        L_0x0205:
            r26.z()     // Catch:{ all -> 0x0210 }
            r0 = 0
        L_0x0209:
            if (r0 == 0) goto L_0x0212
            java.util.List r0 = defpackage.x53.e0(r0)     // Catch:{ all -> 0x0210 }
            goto L_0x0213
        L_0x0210:
            r0 = move-exception
            goto L_0x0217
        L_0x0212:
            r0 = r8
        L_0x0213:
            r17 = r0
            goto L_0x0309
        L_0x0217:
            defpackage.hm9.l0(r3, r2, r0)
            java.util.concurrent.CopyOnWriteArraySet r4 = defpackage.u7d.a
            java.util.Iterator r4 = r4.iterator()
        L_0x0220:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0233
            java.lang.Object r7 = r4.next()
            r4a r7 = (defpackage.r4a) r7
            r7.getClass()
            defpackage.r4a.a(r0)
            goto L_0x0220
        L_0x0233:
            int r4 = defpackage.k7d.a
            int r4 = defpackage.au1.s(r4)
            if (r4 == 0) goto L_0x0244
            if (r4 == r5) goto L_0x0243
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0243:
            throw r0
        L_0x0244:
            r17 = r8
            goto L_0x0309
        L_0x0248:
            java.lang.String r4 = "editOn"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0251
            goto L_0x0297
        L_0x0251:
            long r24 = defpackage.lz7.M(r1, r9)     // Catch:{ all -> 0x025d }
            java.lang.Long r0 = java.lang.Long.valueOf(r24)     // Catch:{ all -> 0x025d }
            r19 = r0
            goto L_0x0309
        L_0x025d:
            r0 = move-exception
            defpackage.hm9.l0(r3, r2, r0)
            java.util.concurrent.CopyOnWriteArraySet r4 = defpackage.u7d.a
            java.util.Iterator r4 = r4.iterator()
        L_0x0267:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x027a
            java.lang.Object r7 = r4.next()
            r4a r7 = (defpackage.r4a) r7
            r7.getClass()
            defpackage.r4a.a(r0)
            goto L_0x0267
        L_0x027a:
            int r4 = defpackage.k7d.a
            int r4 = defpackage.au1.s(r4)
            if (r4 == 0) goto L_0x028b
            if (r4 == r5) goto L_0x028a
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x028a:
            throw r0
        L_0x028b:
            r19 = 0
            goto L_0x0309
        L_0x028f:
            java.lang.String r4 = "saveTime"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x02ca
        L_0x0297:
            r26.z()     // Catch:{ all -> 0x029b }
            goto L_0x0309
        L_0x029b:
            r0 = move-exception
            r4 = r0
            defpackage.hm9.l0(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x02a6:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x02b9
            java.lang.Object r7 = r0.next()
            r4a r7 = (defpackage.r4a) r7
            r7.getClass()
            defpackage.r4a.a(r4)
            goto L_0x02a6
        L_0x02b9:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x0309
            if (r0 == r5) goto L_0x02c9
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x02c9:
            throw r4
        L_0x02ca:
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            long r20 = defpackage.lz7.M(r1, r9)     // Catch:{ all -> 0x02d7 }
            java.lang.Long r4 = java.lang.Long.valueOf(r20)     // Catch:{ all -> 0x02d7 }
            goto L_0x0305
        L_0x02d7:
            r0 = move-exception
            defpackage.hm9.l0(r3, r2, r0)
            java.util.concurrent.CopyOnWriteArraySet r7 = defpackage.u7d.a
            java.util.Iterator r7 = r7.iterator()
        L_0x02e1:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L_0x02f4
            java.lang.Object r12 = r7.next()
            r4a r12 = (defpackage.r4a) r12
            r12.getClass()
            defpackage.r4a.a(r0)
            goto L_0x02e1
        L_0x02f4:
            int r7 = defpackage.k7d.a
            int r7 = defpackage.au1.s(r7)
            if (r7 == 0) goto L_0x0305
            if (r7 == r5) goto L_0x0304
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0304:
            throw r0
        L_0x0305:
            long r20 = r4.longValue()
        L_0x0309:
            int r11 = r11 + 1
            r7 = 0
            goto L_0x0052
        L_0x030e:
            java.util.Iterator r0 = r16.iterator()
        L_0x0312:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x032d
            java.lang.Object r1 = r0.next()
            bz r1 = (defpackage.bz) r1
            boolean r2 = r1 instanceof defpackage.tva
            if (r2 == 0) goto L_0x0312
            tva r1 = (defpackage.tva) r1
            boolean r2 = r1.s0
            if (r2 == 0) goto L_0x0312
            java.lang.String r2 = r1.v0
            r1.X = r2
            goto L_0x0312
        L_0x032d:
            n7d r0 = new n7d
            r12 = r0
            r12.<init>(r13, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tfg.y(gy8):n7d");
    }

    public static void z(fw4 fw4, ByteBuffer byteBuffer, int i, long j) {
        int b2;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (b2 = fw4.b(j, byteBuffer)) != -1) {
            j += (long) b2;
        }
        if (byteBuffer.remaining() <= 0) {
            byteBuffer.position(0);
            return;
        }
        throw new UnsatisfiedLinkError("ELF file truncated");
    }

    public abstract void E(eu0 eu0);

    public abstract long g();

    public abstract rl8 h();
}
