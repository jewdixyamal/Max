package ru.ok.tamtam.nano;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.ok.tamtam.nano.Protos;

public abstract class b {
    public static final byte[] a = new byte[0];

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, py7] */
    static {
        s36.d = new Object();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, s82] */
    public static HashMap a(Map map) {
        HashMap hashMap = new HashMap(map.size());
        for (Long l : map.keySet()) {
            Protos.Chat.AdminParticipant adminParticipant = (Protos.Chat.AdminParticipant) map.get(l);
            ? obj = new Object();
            obj.b = adminParticipant.id;
            obj.a = adminParticipant.permissions;
            obj.c = adminParticipant.inviterId;
            obj.d = adminParticipant.alias;
            hashMap.put(l, new t82(obj));
        }
        return hashMap;
    }

    public static int b(int i) {
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 1 : 6;
        }
        return 5;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v10, types: [t10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v13, types: [y10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v19, types: [java.lang.Object, m10] */
    /* JADX WARNING: type inference failed for: r9v20, types: [r10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v22, types: [f10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v24, types: [b20, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v26, types: [e20, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v54, types: [h10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v75, types: [java.lang.Object, o10] */
    public static l20 c(Protos.Attaches.Attach attach) {
        j10 j10;
        e5g e5g;
        j10 j102;
        List list;
        int lastIndexOf;
        int i;
        int i2;
        Protos.Attaches.Attach attach2 = attach;
        int i3 = l20.A;
        ? obj = new Object();
        obj.j = attach2.lastErrorTime;
        float f = attach2.progressFloat;
        if (f == 0.0f) {
            f = (float) attach2.progress;
        }
        obj.k = f;
        obj.l = attach2.localId;
        obj.m = attach2.localPath;
        obj.n = attach2.isDeleted;
        obj.o = attach2.totalBytes;
        obj.p = attach2.bytesDownloaded;
        obj.u = attach2.lastModified;
        obj.y = attach2.sensitiveContentUnlocked;
        obj.z = attach2.sensitive;
        int i4 = attach2.type;
        g20 g20 = g20.a;
        switch (i4) {
            case 1:
                g20 = g20.b;
                break;
            case 2:
                g20 = g20.c;
                break;
            case 3:
                g20 = g20.o;
                break;
            case 4:
                g20 = g20.X;
                break;
            case 5:
                g20 = g20.Y;
                break;
            case 6:
                g20 = g20.Z;
                break;
            case 7:
                g20 = g20.t0;
                break;
            case 8:
                g20 = g20.s0;
                break;
            case 10:
                g20 = g20.u0;
                break;
            case 11:
                g20 = g20.v0;
                break;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                g20 = g20.w0;
                break;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                g20 = g20.x0;
                break;
            case 16:
                g20 = g20.y0;
                break;
        }
        obj.a = g20;
        int i5 = attach2.status;
        d20 d20 = d20.a;
        int i6 = 4;
        if (i5 != 0) {
            if (i5 == 1) {
                d20 = d20.b;
            } else if (i5 == 2) {
                d20 = d20.c;
            } else if (i5 == 3) {
                d20 = d20.o;
            } else if (i5 == 4) {
                d20 = d20.X;
            }
        }
        obj.i = d20;
        Protos.Attaches.Attach.Photo photo = attach2.photo;
        if (photo != null) {
            obj.b = n(photo);
        }
        Protos.Attaches.Attach.Control control = attach2.control;
        if (control != null) {
            int i7 = q10.p;
            ? obj2 = new Object();
            int i8 = control.event;
            p10 p10 = p10.a;
            switch (i8) {
                case 1:
                    p10 = p10.b;
                    break;
                case 2:
                    p10 = p10.c;
                    break;
                case 3:
                    p10 = p10.o;
                    break;
                case 4:
                    p10 = p10.X;
                    break;
                case 5:
                    p10 = p10.Y;
                    break;
                case 6:
                    p10 = p10.Z;
                    break;
                case 7:
                case 8:
                    p10 = p10.s0;
                    break;
                case 9:
                    p10 = p10.t0;
                    break;
                case 10:
                    p10 = p10.u0;
                    break;
                case 11:
                    p10 = p10.v0;
                    break;
            }
            obj2.a = p10;
            obj2.b = control.userId;
            obj2.c = nd7.i(control.userIds);
            Protos.Attaches.Attach.Control control2 = attach2.control;
            obj2.d = control2.title;
            obj2.e = control2.iconToken;
            obj2.f = control2.url;
            obj2.g = control2.fullUrl;
            obj2.k = control2.showHistory;
            int i9 = control2.chatType;
            if (i9 == 1) {
                obj2.l = 3;
            } else if (i9 == 2) {
                obj2.l = 4;
            } else if (i9 == 3) {
                obj2.l = 5;
            } else if (i9 != 4) {
                obj2.l = 1;
            } else {
                obj2.l = 2;
            }
            Protos.Attaches.Attach.Rect rect = control2.crop;
            if (rect != null) {
                a20 a20 = r11;
                a20 a202 = new a20(rect.left, rect.top, rect.right, rect.bottom, 0);
                obj2.h = a20;
            }
            obj2.i = control2.message;
            obj2.j = control2.shortMessage;
            obj2.m = control2.pinnedMessageId;
            obj2.n = control2.pinnedMessageServerId;
            obj2.o = control2.startPayload;
            obj.c = obj2.a();
        }
        Protos.Attaches.Attach.Video video = attach2.video;
        if (video != null) {
            k20 k20 = k20.r;
            h20 h20 = new h20();
            h20.a = video.videoId;
            int i10 = video.videoType;
            int[] v = au1.v(2);
            int length = v.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    i2 = v[i11];
                    if (au1.s(i2) != i10) {
                        i11++;
                    }
                } else {
                    i2 = 1;
                }
            }
            h20.q = i2;
            Protos.Attaches.Attach.Video video2 = attach2.video;
            h20.b = (long) video2.duration;
            h20.c = video2.thumbnail;
            h20.d = video2.width;
            h20.e = video2.height;
            h20.f = video2.live;
            h20.g = video2.externalUrl;
            h20.h = video2.externalSiteName;
            h20.i = video2.previewData;
            h20.j = video2.startTime;
            h20.l = video2.token;
            h20.n = video2.ignoreAutoplay;
            h20.o = video2.audioTrackIndex;
            h20.p = video2.audioGroupIndex;
            Protos.Attaches.Attach.Video.ConvertOptions convertOptions = video2.convertOptions;
            if (convertOptions != null) {
                int i12 = j20.e;
                i20 i20 = new i20(0);
                i20.b = convertOptions.startTrimPosition;
                i20.c = convertOptions.endTrimPosition;
                i20.d = convertOptions.mute;
                if (convertOptions.quality != null) {
                    i20.a = mqb.values()[attach2.video.convertOptions.quality.ordinal];
                } else {
                    i20.a = mqb.values()[attach2.video.convertOptions.qualityValue];
                }
                h20.k = new j20(i20);
            }
            Protos.Attaches.Attach.Video.VideoCollage videoCollage = attach2.video.videoCollage;
            if (videoCollage != null) {
                h20.m = new uy(videoCollage.frequency, videoCollage.height, videoCollage.width, videoCollage.count, videoCollage.url);
            }
            obj.d = new k20(h20);
        }
        Protos.Attaches.Attach.Audio audio = attach2.audio;
        if (audio != null) {
            int i13 = audio.transcriptionStatus;
            if (i13 != 0) {
                if (i13 == 1) {
                    i = 2;
                } else if (i13 == 2) {
                    i = 3;
                } else if (i13 == 3) {
                    i = 4;
                } else if (i13 == 4) {
                    i = 5;
                }
                i10 i102 = i10.j;
                ? obj3 = new Object();
                obj3.a = audio.audioId;
                obj3.b = audio.url;
                obj3.c = audio.duration;
                obj3.g = audio.startTime;
                obj3.h = audio.lastStartTimeUpdateTimestamp;
                obj3.d = audio.wave;
                obj3.f = audio.transcription;
                obj3.i = i;
                obj3.e = audio.token;
                obj.e = new i10(obj3);
            }
            i = 1;
            i10 i1022 = i10.j;
            ? obj32 = new Object();
            obj32.a = audio.audioId;
            obj32.b = audio.url;
            obj32.c = audio.duration;
            obj32.g = audio.startTime;
            obj32.h = audio.lastStartTimeUpdateTimestamp;
            obj32.d = audio.wave;
            obj32.f = audio.transcription;
            obj32.i = i;
            obj32.e = audio.token;
            obj.e = new i10(obj32);
        }
        Protos.Attaches.Attach.Sticker sticker = attach2.sticker;
        if (sticker != null) {
            f20 f20 = f20.p;
            ? obj4 = new Object();
            obj4.a = sticker.stickerId;
            obj4.d = sticker.url;
            obj4.b = sticker.width;
            obj4.c = sticker.height;
            obj4.f = sticker.mp4Url;
            obj4.g = sticker.firstUrl;
            String[] strArr = sticker.tags;
            ArrayList arrayList = new ArrayList();
            Collections.addAll(arrayList, strArr);
            obj4.i = arrayList;
            Protos.Attaches.Attach.Sticker sticker2 = attach2.sticker;
            obj4.h = sticker2.previewUrl;
            obj4.e = sticker2.updateTime;
            obj4.k = sticker2.setId;
            obj4.l = sticker2.lottieUrl;
            obj4.o = sticker2.videoUrl;
            obj4.m = sticker2.audio;
            int i14 = sticker2.stickerType;
            if (i14 == 1) {
                obj4.j = 2;
            } else if (i14 == 2) {
                obj4.j = 3;
            } else if (i14 != 4) {
                obj4.j = 1;
            } else {
                obj4.j = 4;
            }
            int i15 = sticker2.authorType;
            if (i15 == 1) {
                obj4.n = 2;
            } else if (i15 != 2) {
                obj4.n = 1;
            } else {
                obj4.n = 3;
            }
            obj.f = obj4.a();
        }
        Protos.Attaches.Attach.Share share = attach2.share;
        if (share != null) {
            int i16 = c20.i;
            ? obj5 = new Object();
            obj5.a = share.shareId;
            obj5.b = share.url;
            obj5.c = share.title;
            obj5.d = share.description;
            obj5.e = share.host;
            Protos.Attaches.Attach.Photo photo2 = share.image;
            if (photo2 != null) {
                obj5.f = n(photo2);
            }
            Protos.Attaches.Attach attach3 = attach2.share.media;
            if (attach3 != null) {
                obj5.g = c(attach3);
            }
            obj5.h = attach2.share.deleted;
            obj.g = new c20(obj5);
        }
        Protos.Attaches.Attach.App app = attach2.app;
        if (app != null) {
            ? obj6 = new Object();
            obj6.a = app.appId;
            obj6.b = app.name;
            obj6.d = app.message;
            obj6.c = app.icon;
            obj6.f = app.timeout;
            obj6.e = app.state;
            obj6.g = app.appState;
            obj.h = new g10(obj6);
        }
        Protos.Attaches.Attach.Call call = attach2.call;
        if (call != null) {
            int i17 = call.callType;
            int i18 = i17 != 1 ? i17 != 2 ? 1 : 3 : 2;
            int i19 = call.hangupType;
            int i21 = i19 != 1 ? i19 != 2 ? i19 != 3 ? i19 != 4 ? 1 : 5 : 4 : 3 : 2;
            long j = call.durationLong;
            if (j == 0) {
                j = (long) call.duration;
            }
            k10 k10 = new k10();
            k10.a = call.conversationId;
            k10.c = call.joinLink;
            k10.d = i18;
            k10.f = i21;
            k10.b = j;
            ArrayList i22 = nd7.i(call.contactIds);
            k10.e = i22;
            if (i22 == null) {
                k10.e = Collections.emptyList();
            }
            obj.q = new l10(k10);
        }
        Protos.Attaches.Attach.File file = attach2.file;
        if (file != null) {
            ? obj7 = new Object();
            obj7.a = file.fileId;
            obj7.b = file.size;
            String str = file.name;
            if (!oag.t(str) && (lastIndexOf = str.lastIndexOf("/")) != -1) {
                str = str.substring(lastIndexOf + 1);
            }
            obj7.c = str;
            Protos.Attaches.Attach attach4 = attach2.file.preview;
            obj7.e = attach4 != null ? c(attach4) : null;
            obj7.d = attach2.file.token;
            obj.r = new s10(obj7);
        }
        Protos.Attaches.Attach.Contact contact = attach2.contact;
        if (contact != null) {
            ? obj8 = new Object();
            obj8.a = contact.vcfBody;
            obj8.b = contact.contactId;
            obj8.c = contact.name;
            obj8.f = contact.phone;
            obj8.g = contact.photoUrl;
            obj8.h = contact.localPhotoUrl;
            obj8.d = contact.firstName;
            obj8.e = contact.lastName;
            obj.s = new n10(obj8);
        }
        Protos.Attaches.Attach.Present present = attach2.present;
        if (present != null) {
            int i23 = present.status;
            if (i23 == 1) {
                i6 = 2;
            } else if (i23 == 2) {
                i6 = 3;
            } else if (i23 != 3) {
                if (i23 != 4) {
                    i6 = 5;
                    if (i23 != 5) {
                        i6 = 1;
                    }
                } else {
                    i6 = 6;
                }
            }
            ? obj9 = new Object();
            obj9.a = present.presentId;
            obj9.b = present.metadataId;
            obj9.c = present.senderId;
            obj9.d = present.receiverId;
            obj9.e = i6;
            obj9.f = present.presentJson;
            obj.t = new y10(obj9);
        }
        Protos.Attaches.Attach.Location location = attach2.location;
        if (location != null) {
            ? obj10 = new Object();
            obj10.a = new er7(location.latitude, location.longitude, location.altitude, location.accuracy, location.bearing, location.speed);
            obj10.b = location.livePeriod;
            obj10.c = location.startTime;
            obj10.d = location.endTime;
            Protos.Attaches.LocationInfo[] locationInfoArr = location.track;
            if (locationInfoArr == null) {
                list = Collections.emptyList();
                j102 = obj;
            } else {
                ArrayList arrayList2 = new ArrayList(locationInfoArr.length);
                int i24 = 0;
                j10 j103 = obj;
                for (int length2 = locationInfoArr.length; i24 < length2; length2 = length2) {
                    Protos.Attaches.LocationInfo locationInfo = locationInfoArr[i24];
                    arrayList2.add(new v10(new er7(locationInfo.latitude, locationInfo.longitude, locationInfo.altitude, locationInfo.accuracy, locationInfo.bearing, locationInfo.speed), locationInfo.time));
                    i24++;
                    j103 = j103;
                    locationInfoArr = locationInfoArr;
                }
                j102 = j103;
                list = arrayList2;
            }
            obj10.e = list;
            obj10.f = location.deviceId;
            obj10.g = location.zoom;
            obj10.h = location.corrupted;
            Protos.Attaches.LocationInfo locationInfo2 = location.lastLocation;
            if (locationInfo2 != null) {
                obj10.i = new v10(new er7(locationInfo2.latitude, locationInfo2.longitude, locationInfo2.altitude, locationInfo2.accuracy, locationInfo2.bearing, locationInfo2.speed), locationInfo2.time);
            }
            j10 = j102;
            j10.v = obj10.a();
        } else {
            j10 = obj;
        }
        Protos.Attaches.Attach.Widget widget = attach2.widget;
        if (widget != null) {
            Protos.Attaches.Attach.Widget.Content[] contentArr = widget.contents;
            ArrayList arrayList3 = new ArrayList(contentArr.length);
            for (Protos.Attaches.Attach.Widget.Content content : contentArr) {
                switch (content.type) {
                    case 1:
                        e5g = e5g.a;
                        break;
                    case 2:
                        e5g = e5g.b;
                        break;
                    case 3:
                        e5g = e5g.c;
                        break;
                    case 4:
                        e5g = e5g.o;
                        break;
                    case 5:
                        e5g = e5g.X;
                        break;
                    case 6:
                        e5g = e5g.Y;
                        break;
                    default:
                        e5g = null;
                        break;
                }
                if (e5g != null) {
                    String str2 = content.text;
                    Protos.MessageElement[] messageElementArr = content.elements;
                    d5g d5g = !str2.isEmpty() ? new d5g(str2, (messageElementArr == null || messageElementArr.length <= 0) ? null : ou8.a(messageElementArr)) : null;
                    Protos.Attaches.Attach.InlineKeyboard inlineKeyboard = content.keyboard;
                    z07 k = inlineKeyboard != null ? k(inlineKeyboard) : null;
                    e eVar = !content.iconUrl.isEmpty() ? new e(content.iconUrl, content.iconWidth, content.iconHeight) : null;
                    if (!(d5g == null && k == null && eVar == null)) {
                        arrayList3.add(new f5g(e5g, d5g, k, eVar));
                    }
                }
            }
            j10.w = arrayList3.isEmpty() ? null : new j5g(arrayList3);
        }
        int i25 = attach2.processingOnServerStatus;
        j10.x = i25 != 1 ? i25 != 2 ? z10.a : z10.c : z10.b;
        return j10.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x031d  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x034c  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x03a8  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x03d7  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0419  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x045a  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x04c7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x055d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0155  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ru.ok.tamtam.nano.Protos.Attaches.Attach d(defpackage.l20 r17) {
        /*
            r0 = r17
            r1 = 1
            ru.ok.tamtam.nano.Protos$Attaches$Attach r2 = new ru.ok.tamtam.nano.Protos$Attaches$Attach
            r2.<init>()
            long r3 = r0.p
            r2.lastErrorTime = r3
            float r3 = r0.q
            r2.progressFloat = r3
            r3 = 0
            r2.progress = r3
            java.lang.String r4 = r0.r
            boolean r5 = defpackage.oag.t(r4)
            if (r5 == 0) goto L_0x0023
            java.util.UUID r4 = java.util.UUID.randomUUID()
            java.lang.String r4 = r4.toString()
        L_0x0023:
            r2.localId = r4
            java.lang.String r4 = ""
            java.lang.String r5 = r0.s
            if (r5 != 0) goto L_0x002c
            r5 = r4
        L_0x002c:
            r2.localPath = r5
            boolean r5 = r0.t
            r2.isDeleted = r5
            long r5 = r0.u
            r2.totalBytes = r5
            long r5 = r0.v
            r2.bytesDownloaded = r5
            long r5 = r0.w
            r2.lastModified = r5
            boolean r5 = r0.y
            r2.sensitiveContentUnlocked = r5
            boolean r5 = r0.z
            r2.sensitive = r5
            g20 r5 = r0.a
            int r5 = r5.ordinal()
            r6 = 8
            r7 = 10
            r8 = 11
            r9 = 6
            r10 = 5
            r11 = 3
            r12 = 4
            r13 = 2
            switch(r5) {
                case 1: goto L_0x0077;
                case 2: goto L_0x0075;
                case 3: goto L_0x0073;
                case 4: goto L_0x0071;
                case 5: goto L_0x006f;
                case 6: goto L_0x006d;
                case 7: goto L_0x006b;
                case 8: goto L_0x0069;
                case 9: goto L_0x0067;
                case 10: goto L_0x0065;
                case 11: goto L_0x0062;
                case 12: goto L_0x005f;
                case 13: goto L_0x005c;
                default: goto L_0x005a;
            }
        L_0x005a:
            r5 = r3
            goto L_0x0078
        L_0x005c:
            r5 = 16
            goto L_0x0078
        L_0x005f:
            r5 = 14
            goto L_0x0078
        L_0x0062:
            r5 = 12
            goto L_0x0078
        L_0x0065:
            r5 = r8
            goto L_0x0078
        L_0x0067:
            r5 = r7
            goto L_0x0078
        L_0x0069:
            r5 = 7
            goto L_0x0078
        L_0x006b:
            r5 = r6
            goto L_0x0078
        L_0x006d:
            r5 = r9
            goto L_0x0078
        L_0x006f:
            r5 = r10
            goto L_0x0078
        L_0x0071:
            r5 = r12
            goto L_0x0078
        L_0x0073:
            r5 = r11
            goto L_0x0078
        L_0x0075:
            r5 = r13
            goto L_0x0078
        L_0x0077:
            r5 = r1
        L_0x0078:
            r2.type = r5
            d20 r5 = r0.o
            int r5 = r5.ordinal()
            if (r5 == 0) goto L_0x008a
            if (r5 == r1) goto L_0x0092
            if (r5 == r13) goto L_0x0090
            if (r5 == r11) goto L_0x008e
            if (r5 == r12) goto L_0x008c
        L_0x008a:
            r5 = r3
            goto L_0x0093
        L_0x008c:
            r5 = r12
            goto L_0x0093
        L_0x008e:
            r5 = r11
            goto L_0x0093
        L_0x0090:
            r5 = r13
            goto L_0x0093
        L_0x0092:
            r5 = r1
        L_0x0093:
            r2.status = r5
            boolean r5 = r17.f()
            if (r5 == 0) goto L_0x00a3
            x10 r5 = r0.b
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Photo r5 = o(r5)
            r2.photo = r5
        L_0x00a3:
            q10 r5 = r0.c
            if (r5 == 0) goto L_0x014f
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Control r14 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$Control
            r14.<init>()
            p10 r15 = r5.a
            int r15 = r15.ordinal()
            switch(r15) {
                case 1: goto L_0x00c8;
                case 2: goto L_0x00c6;
                case 3: goto L_0x00c4;
                case 4: goto L_0x00c2;
                case 5: goto L_0x00c0;
                case 6: goto L_0x00be;
                case 7: goto L_0x00c9;
                case 8: goto L_0x00bb;
                case 9: goto L_0x00b9;
                case 10: goto L_0x00b7;
                default: goto L_0x00b5;
            }
        L_0x00b5:
            r6 = r3
            goto L_0x00c9
        L_0x00b7:
            r6 = r8
            goto L_0x00c9
        L_0x00b9:
            r6 = r7
            goto L_0x00c9
        L_0x00bb:
            r6 = 9
            goto L_0x00c9
        L_0x00be:
            r6 = r9
            goto L_0x00c9
        L_0x00c0:
            r6 = r10
            goto L_0x00c9
        L_0x00c2:
            r6 = r12
            goto L_0x00c9
        L_0x00c4:
            r6 = r11
            goto L_0x00c9
        L_0x00c6:
            r6 = r13
            goto L_0x00c9
        L_0x00c8:
            r6 = r1
        L_0x00c9:
            r14.event = r6
            long r6 = r5.b
            r14.userId = r6
            java.util.ArrayList r6 = r5.c
            long[] r6 = defpackage.nd7.j(r6)
            r14.userIds = r6
            java.lang.String r6 = r5.d
            if (r6 != 0) goto L_0x00dc
            r6 = r4
        L_0x00dc:
            r14.title = r6
            java.lang.String r6 = r5.e
            if (r6 != 0) goto L_0x00e3
            r6 = r4
        L_0x00e3:
            r14.iconToken = r6
            java.lang.String r6 = r5.f
            if (r6 != 0) goto L_0x00ea
            r6 = r4
        L_0x00ea:
            r14.url = r6
            java.lang.String r6 = r5.g
            if (r6 != 0) goto L_0x00f1
            r6 = r4
        L_0x00f1:
            r14.fullUrl = r6
            a20 r6 = r5.h
            if (r6 == 0) goto L_0x010e
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Rect r7 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$Rect
            r7.<init>()
            r14.crop = r7
            float r8 = r6.b
            r7.left = r8
            float r8 = r6.c
            r7.top = r8
            float r8 = r6.d
            r7.right = r8
            float r6 = r6.e
            r7.bottom = r6
        L_0x010e:
            java.lang.String r6 = r5.i
            if (r6 != 0) goto L_0x0113
            r6 = r4
        L_0x0113:
            r14.message = r6
            java.lang.String r6 = r5.j
            if (r6 != 0) goto L_0x011a
            r6 = r4
        L_0x011a:
            r14.shortMessage = r6
            boolean r6 = r5.k
            r14.showHistory = r6
            int r6 = r5.l
            if (r6 == 0) goto L_0x013e
            int r6 = defpackage.au1.s(r6)
            if (r6 == r1) goto L_0x013c
            if (r6 == r13) goto L_0x0139
            if (r6 == r11) goto L_0x0136
            if (r6 == r12) goto L_0x0133
            r14.chatType = r3
            goto L_0x013e
        L_0x0133:
            r14.chatType = r11
            goto L_0x013e
        L_0x0136:
            r14.chatType = r13
            goto L_0x013e
        L_0x0139:
            r14.chatType = r1
            goto L_0x013e
        L_0x013c:
            r14.chatType = r12
        L_0x013e:
            long r6 = r5.m
            r14.pinnedMessageId = r6
            long r6 = r5.n
            r14.pinnedMessageServerId = r6
            java.lang.String r5 = r5.o
            if (r5 != 0) goto L_0x014b
            r5 = r4
        L_0x014b:
            r14.startPayload = r5
            r2.control = r14
        L_0x014f:
            boolean r5 = r17.i()
            if (r5 == 0) goto L_0x01eb
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Video r5 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$Video
            r5.<init>()
            k20 r6 = r0.d
            long r7 = r6.a
            r5.videoId = r7
            int r7 = r6.b
            int r7 = defpackage.au1.s(r7)
            r5.videoType = r7
            long r7 = r6.c
            int r7 = (int) r7
            r5.duration = r7
            java.lang.String r7 = r6.d
            if (r7 != 0) goto L_0x0172
            r7 = r4
        L_0x0172:
            r5.thumbnail = r7
            int r7 = r6.e
            r5.width = r7
            int r7 = r6.f
            r5.height = r7
            boolean r7 = r6.g
            r5.live = r7
            java.lang.String r7 = r6.h
            if (r7 != 0) goto L_0x0185
            r7 = r4
        L_0x0185:
            r5.externalUrl = r7
            java.lang.String r7 = r6.i
            if (r7 != 0) goto L_0x018c
            r7 = r4
        L_0x018c:
            r5.externalSiteName = r7
            byte[] r7 = r6.j
            if (r7 == 0) goto L_0x0194
            r5.previewData = r7
        L_0x0194:
            long r7 = r6.k
            r5.startTime = r7
            java.lang.String r7 = r6.m
            if (r7 != 0) goto L_0x019d
            r7 = r4
        L_0x019d:
            r5.token = r7
            boolean r7 = r6.o
            r5.ignoreAutoplay = r7
            int r7 = r6.p
            r5.audioTrackIndex = r7
            int r7 = r6.q
            r5.audioGroupIndex = r7
            j20 r7 = r6.l
            if (r7 == 0) goto L_0x01c8
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Video$ConvertOptions r8 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$Video$ConvertOptions
            r8.<init>()
            float r14 = r7.a
            r8.startTrimPosition = r14
            float r14 = r7.b
            r8.endTrimPosition = r14
            mqb r14 = r7.c
            int r14 = r14.b
            r8.qualityValue = r14
            boolean r7 = r7.d
            r8.mute = r7
            r5.convertOptions = r8
        L_0x01c8:
            uy r6 = r6.n
            if (r6 == 0) goto L_0x01e9
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Video$VideoCollage r7 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$Video$VideoCollage
            r7.<init>()
            java.lang.Object r8 = r6.Y
            java.lang.String r8 = (java.lang.String) r8
            r7.url = r8
            int r8 = r6.b
            r7.frequency = r8
            int r8 = r6.c
            r7.height = r8
            int r8 = r6.o
            r7.width = r8
            int r6 = r6.X
            r7.count = r6
            r5.videoCollage = r7
        L_0x01e9:
            r2.video = r5
        L_0x01eb:
            boolean r5 = r17.a()
            if (r5 == 0) goto L_0x0247
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Audio r5 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$Audio
            r5.<init>()
            i10 r6 = r0.e
            long r7 = r6.a
            r5.audioId = r7
            java.lang.String r7 = r6.b
            if (r7 != 0) goto L_0x0201
            r7 = r4
        L_0x0201:
            r5.url = r7
            long r7 = r6.c
            r5.duration = r7
            byte[] r7 = r6.d
            if (r7 == 0) goto L_0x020d
            r5.wave = r7
        L_0x020d:
            java.lang.String r7 = r6.f
            if (r7 == 0) goto L_0x0213
            r5.transcription = r7
        L_0x0213:
            int r7 = r6.i
            if (r7 == 0) goto L_0x0236
            int r7 = defpackage.au1.s(r7)
            if (r7 == 0) goto L_0x0234
            if (r7 == r1) goto L_0x0231
            if (r7 == r13) goto L_0x022e
            if (r7 == r11) goto L_0x022b
            if (r7 == r12) goto L_0x0228
            r5.transcriptionStatus = r3
            goto L_0x0236
        L_0x0228:
            r5.transcriptionStatus = r12
            goto L_0x0236
        L_0x022b:
            r5.transcriptionStatus = r11
            goto L_0x0236
        L_0x022e:
            r5.transcriptionStatus = r13
            goto L_0x0236
        L_0x0231:
            r5.transcriptionStatus = r1
            goto L_0x0236
        L_0x0234:
            r5.transcriptionStatus = r3
        L_0x0236:
            java.lang.String r7 = r6.e
            if (r7 != 0) goto L_0x023b
            r7 = r4
        L_0x023b:
            r5.token = r7
            long r7 = r6.g
            r5.startTime = r7
            long r6 = r6.h
            r5.lastStartTimeUpdateTimestamp = r6
            r2.audio = r5
        L_0x0247:
            boolean r5 = r17.h()
            if (r5 == 0) goto L_0x02d2
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Sticker r5 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$Sticker
            r5.<init>()
            f20 r6 = r0.f
            long r7 = r6.a
            r5.stickerId = r7
            java.lang.String r7 = r6.b
            if (r7 != 0) goto L_0x025d
            r7 = r4
        L_0x025d:
            r5.url = r7
            int r7 = r6.c
            r5.width = r7
            int r7 = r6.d
            r5.height = r7
            java.lang.String r7 = r6.e
            if (r7 != 0) goto L_0x026c
            r7 = r4
        L_0x026c:
            r5.mp4Url = r7
            java.lang.String r7 = r6.f
            if (r7 != 0) goto L_0x0273
            r7 = r4
        L_0x0273:
            r5.firstUrl = r7
            java.util.List r7 = r6.g
            int r8 = r7.size()
            java.lang.String[] r8 = new java.lang.String[r8]
            java.lang.Object[] r7 = r7.toArray(r8)
            java.lang.String[] r7 = (java.lang.String[]) r7
            r5.tags = r7
            java.lang.String r7 = r6.h
            if (r7 != 0) goto L_0x028a
            r7 = r4
        L_0x028a:
            r5.previewUrl = r7
            long r7 = r6.i
            r5.updateTime = r7
            int r7 = r6.j
            if (r7 == 0) goto L_0x02a7
            int r7 = defpackage.au1.s(r7)
            if (r7 == r1) goto L_0x02a4
            if (r7 == r13) goto L_0x02a2
            if (r7 == r11) goto L_0x02a0
            r7 = r3
            goto L_0x02a5
        L_0x02a0:
            r7 = r12
            goto L_0x02a5
        L_0x02a2:
            r7 = r13
            goto L_0x02a5
        L_0x02a4:
            r7 = r1
        L_0x02a5:
            r5.stickerType = r7
        L_0x02a7:
            long r7 = r6.k
            r5.setId = r7
            java.lang.String r7 = r6.l
            if (r7 != 0) goto L_0x02b0
            r7 = r4
        L_0x02b0:
            r5.lottieUrl = r7
            boolean r7 = r6.m
            r5.audio = r7
            int r7 = r6.n
            if (r7 == 0) goto L_0x02c9
            int r7 = defpackage.au1.s(r7)
            if (r7 == r1) goto L_0x02c6
            if (r7 == r13) goto L_0x02c4
            r7 = r3
            goto L_0x02c7
        L_0x02c4:
            r7 = r13
            goto L_0x02c7
        L_0x02c6:
            r7 = r1
        L_0x02c7:
            r5.authorType = r7
        L_0x02c9:
            java.lang.String r6 = r6.o
            if (r6 != 0) goto L_0x02ce
            r6 = r4
        L_0x02ce:
            r5.videoUrl = r6
            r2.sticker = r5
        L_0x02d2:
            boolean r5 = r17.g()
            if (r5 == 0) goto L_0x0319
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Share r5 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$Share
            r5.<init>()
            c20 r6 = r0.g
            long r7 = r6.a
            r5.shareId = r7
            java.lang.String r7 = r6.b
            if (r7 != 0) goto L_0x02e8
            r7 = r4
        L_0x02e8:
            r5.url = r7
            java.lang.String r7 = r6.c
            if (r7 != 0) goto L_0x02ef
            r7 = r4
        L_0x02ef:
            r5.title = r7
            java.lang.String r7 = r6.d
            if (r7 != 0) goto L_0x02f6
            r7 = r4
        L_0x02f6:
            r5.description = r7
            java.lang.String r7 = r6.e
            if (r7 != 0) goto L_0x02fd
            r7 = r4
        L_0x02fd:
            r5.host = r7
            x10 r7 = r6.f
            if (r7 == 0) goto L_0x0309
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Photo r7 = o(r7)
            r5.image = r7
        L_0x0309:
            l20 r7 = r6.g
            if (r7 == 0) goto L_0x0313
            ru.ok.tamtam.nano.Protos$Attaches$Attach r7 = d(r7)
            r5.media = r7
        L_0x0313:
            boolean r6 = r6.h
            r5.deleted = r6
            r2.share = r5
        L_0x0319:
            g10 r5 = r0.h
            if (r5 == 0) goto L_0x0348
            ru.ok.tamtam.nano.Protos$Attaches$Attach$App r6 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$App
            r6.<init>()
            long r7 = r5.a
            r6.appId = r7
            java.lang.String r7 = r5.b
            if (r7 == 0) goto L_0x032c
            r6.name = r7
        L_0x032c:
            java.lang.String r7 = r5.c
            if (r7 == 0) goto L_0x0332
            r6.icon = r7
        L_0x0332:
            java.lang.String r7 = r5.d
            if (r7 == 0) goto L_0x0338
            r6.message = r7
        L_0x0338:
            int r7 = r5.e
            r6.state = r7
            long r7 = r5.f
            r6.timeout = r7
            java.lang.String r5 = r5.g
            if (r5 == 0) goto L_0x0346
            r6.appState = r5
        L_0x0346:
            r2.app = r6
        L_0x0348:
            l10 r5 = r0.i
            if (r5 == 0) goto L_0x03a2
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Call r6 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$Call
            r6.<init>()
            java.lang.String r7 = r5.a
            r6.conversationId = r7
            int r7 = r5.c
            if (r7 == 0) goto L_0x036a
            int r7 = defpackage.au1.s(r7)
            if (r7 == r1) goto L_0x0367
            if (r7 == r13) goto L_0x0364
            r6.callType = r3
            goto L_0x036c
        L_0x0364:
            r6.callType = r13
            goto L_0x036c
        L_0x0367:
            r6.callType = r1
            goto L_0x036c
        L_0x036a:
            r6.callType = r3
        L_0x036c:
            int r7 = r5.d
            if (r7 == 0) goto L_0x038b
            int r7 = defpackage.au1.s(r7)
            if (r7 == r1) goto L_0x0388
            if (r7 == r13) goto L_0x0385
            if (r7 == r11) goto L_0x0382
            if (r7 == r12) goto L_0x037f
            r6.hangupType = r3
            goto L_0x038d
        L_0x037f:
            r6.hangupType = r12
            goto L_0x038d
        L_0x0382:
            r6.hangupType = r11
            goto L_0x038d
        L_0x0385:
            r6.hangupType = r13
            goto L_0x038d
        L_0x0388:
            r6.hangupType = r1
            goto L_0x038d
        L_0x038b:
            r6.hangupType = r3
        L_0x038d:
            long r7 = r5.e
            r6.durationLong = r7
            java.util.List r7 = r5.f
            long[] r7 = defpackage.nd7.j(r7)
            r6.contactIds = r7
            java.lang.String r5 = r5.b
            if (r5 != 0) goto L_0x039e
            r5 = r4
        L_0x039e:
            r6.joinLink = r5
            r2.call = r6
        L_0x03a2:
            boolean r5 = r17.c()
            if (r5 == 0) goto L_0x03d1
            ru.ok.tamtam.nano.Protos$Attaches$Attach$File r5 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$File
            r5.<init>()
            s10 r6 = r0.j
            long r7 = r6.a
            r5.fileId = r7
            long r7 = r6.b
            r5.size = r7
            java.lang.String r7 = r6.c
            if (r7 != 0) goto L_0x03bc
            r7 = r4
        L_0x03bc:
            r5.name = r7
            l20 r7 = r6.d
            if (r7 == 0) goto L_0x03c8
            ru.ok.tamtam.nano.Protos$Attaches$Attach r7 = d(r7)
            r5.preview = r7
        L_0x03c8:
            java.lang.String r6 = r6.e
            if (r6 != 0) goto L_0x03cd
            r6 = r4
        L_0x03cd:
            r5.token = r6
            r2.file = r5
        L_0x03d1:
            boolean r5 = r17.b()
            if (r5 == 0) goto L_0x0415
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Contact r5 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$Contact
            r5.<init>()
            n10 r6 = r0.k
            java.lang.String r7 = r6.a
            if (r7 != 0) goto L_0x03e3
            r7 = r4
        L_0x03e3:
            r5.vcfBody = r7
            long r7 = r6.b
            r5.contactId = r7
            java.lang.String r7 = r6.c
            if (r7 != 0) goto L_0x03ee
            r7 = r4
        L_0x03ee:
            r5.name = r7
            java.lang.String r7 = r6.f
            if (r7 != 0) goto L_0x03f5
            r7 = r4
        L_0x03f5:
            r5.phone = r7
            java.lang.String r7 = r6.g
            if (r7 != 0) goto L_0x03fc
            r7 = r4
        L_0x03fc:
            r5.photoUrl = r7
            java.lang.String r7 = r6.h
            if (r7 != 0) goto L_0x0403
            r7 = r4
        L_0x0403:
            r5.localPhotoUrl = r7
            java.lang.String r7 = r6.d
            if (r7 != 0) goto L_0x040a
            r7 = r4
        L_0x040a:
            r5.firstName = r7
            java.lang.String r6 = r6.e
            if (r6 != 0) goto L_0x0411
            r6 = r4
        L_0x0411:
            r5.lastName = r6
            r2.contact = r5
        L_0x0415:
            y10 r5 = r0.l
            if (r5 == 0) goto L_0x0454
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Present r6 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$Present
            r6.<init>()
            long r7 = r5.a
            r6.presentId = r7
            long r7 = r5.b
            r6.metadataId = r7
            long r7 = r5.c
            r6.senderId = r7
            long r7 = r5.d
            r6.receiverId = r7
            int r7 = r5.e
            int r7 = defpackage.au1.s(r7)
            if (r7 == r1) goto L_0x0448
            if (r7 == r13) goto L_0x0446
            if (r7 == r11) goto L_0x0444
            if (r7 == r12) goto L_0x0442
            if (r7 == r10) goto L_0x0440
            r7 = r3
            goto L_0x0449
        L_0x0440:
            r7 = r12
            goto L_0x0449
        L_0x0442:
            r7 = r10
            goto L_0x0449
        L_0x0444:
            r7 = r11
            goto L_0x0449
        L_0x0446:
            r7 = r13
            goto L_0x0449
        L_0x0448:
            r7 = r1
        L_0x0449:
            r6.status = r7
            java.lang.String r5 = r5.f
            if (r5 != 0) goto L_0x0450
            r5 = r4
        L_0x0450:
            r6.presentJson = r5
            r2.present = r6
        L_0x0454:
            boolean r5 = r17.e()
            if (r5 == 0) goto L_0x04c3
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Location r5 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$Location
            r5.<init>()
            u10 r6 = r0.m
            er7 r7 = r6.a
            double r14 = r7.a
            r5.latitude = r14
            double r14 = r7.b
            r5.longitude = r14
            double r14 = r7.c
            r5.altitude = r14
            float r8 = r7.o
            r5.accuracy = r8
            float r8 = r7.X
            r5.bearing = r8
            float r7 = r7.Y
            r5.speed = r7
            long r7 = r6.b
            r5.livePeriod = r7
            long r7 = r6.c
            r5.startTime = r7
            long r7 = r6.d
            r5.endTime = r7
            java.util.List r7 = r6.e
            if (r7 == 0) goto L_0x04a8
            int r8 = r7.size()
            ru.ok.tamtam.nano.Protos$Attaches$LocationInfo[] r8 = new ru.ok.tamtam.nano.Protos.Attaches.LocationInfo[r8]
            r14 = r3
        L_0x0492:
            int r15 = r7.size()
            if (r14 >= r15) goto L_0x04a6
            java.lang.Object r15 = r7.get(r14)
            v10 r15 = (defpackage.v10) r15
            ru.ok.tamtam.nano.Protos$Attaches$LocationInfo r15 = m(r15)
            r8[r14] = r15
            int r14 = r14 + r1
            goto L_0x0492
        L_0x04a6:
            r5.track = r8
        L_0x04a8:
            java.lang.String r7 = r6.f
            if (r7 != 0) goto L_0x04ad
            r7 = r4
        L_0x04ad:
            r5.deviceId = r7
            float r7 = r6.g
            r5.zoom = r7
            boolean r7 = r6.h
            r5.corrupted = r7
            v10 r6 = r6.i
            if (r6 == 0) goto L_0x04c1
            ru.ok.tamtam.nano.Protos$Attaches$LocationInfo r6 = m(r6)
            r5.lastLocation = r6
        L_0x04c1:
            r2.location = r5
        L_0x04c3:
            j5g r5 = r0.n
            if (r5 == 0) goto L_0x0555
            java.util.List r5 = r5.a
            int r6 = r5.size()
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Widget$Content[] r6 = new ru.ok.tamtam.nano.Protos.Attaches.Attach.Widget.Content[r6]
            r7 = r3
        L_0x04d0:
            int r8 = r5.size()
            if (r7 >= r8) goto L_0x054c
            java.lang.Object r8 = r5.get(r7)
            f5g r8 = (defpackage.f5g) r8
            e5g r14 = r8.a
            int r14 = r14.ordinal()
            if (r14 == 0) goto L_0x04fa
            if (r14 == r1) goto L_0x04f8
            if (r14 == r13) goto L_0x04f6
            if (r14 == r11) goto L_0x04f4
            if (r14 == r12) goto L_0x04f2
            if (r14 == r9) goto L_0x04f0
            r14 = r3
            goto L_0x04fb
        L_0x04f0:
            r14 = r9
            goto L_0x04fb
        L_0x04f2:
            r14 = r10
            goto L_0x04fb
        L_0x04f4:
            r14 = r12
            goto L_0x04fb
        L_0x04f6:
            r14 = r11
            goto L_0x04fb
        L_0x04f8:
            r14 = r13
            goto L_0x04fb
        L_0x04fa:
            r14 = r1
        L_0x04fb:
            if (r14 != 0) goto L_0x04fe
            goto L_0x054a
        L_0x04fe:
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Widget$Content r15 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$Widget$Content
            r15.<init>()
            r15.type = r14
            java.lang.String r14 = r8.a()
            r15.text = r14
            d5g r14 = r8.b
            if (r14 == 0) goto L_0x0512
            java.util.List r14 = r14.b
            goto L_0x0513
        L_0x0512:
            r14 = 0
        L_0x0513:
            if (r14 != 0) goto L_0x0517
            nz4 r14 = defpackage.nz4.a
        L_0x0517:
            boolean r16 = r14.isEmpty()
            if (r16 != 0) goto L_0x0525
            ru.ok.tamtam.nano.Protos$MessageElements r14 = defpackage.ou8.c(r14)
            ru.ok.tamtam.nano.Protos$MessageElement[] r14 = r14.elements
            r15.elements = r14
        L_0x0525:
            boolean r14 = r8.b()
            if (r14 == 0) goto L_0x0535
            z07 r14 = r8.c
            if (r14 == 0) goto L_0x0535
            ru.ok.tamtam.nano.Protos$Attaches$Attach$InlineKeyboard r14 = l(r14)
            r15.keyboard = r14
        L_0x0535:
            e r8 = r8.d
            if (r8 == 0) goto L_0x0548
            java.lang.String r14 = r8.c
            if (r14 != 0) goto L_0x053e
            r14 = r4
        L_0x053e:
            r15.iconUrl = r14
            int r14 = r8.a
            r15.iconWidth = r14
            int r8 = r8.b
            r15.iconHeight = r8
        L_0x0548:
            r6[r7] = r15
        L_0x054a:
            int r7 = r7 + r1
            goto L_0x04d0
        L_0x054c:
            ru.ok.tamtam.nano.Protos$Attaches$Attach$Widget r4 = new ru.ok.tamtam.nano.Protos$Attaches$Attach$Widget
            r4.<init>()
            r4.contents = r6
            r2.widget = r4
        L_0x0555:
            z10 r0 = r0.x
            int r0 = r0.ordinal()
            if (r0 == r1) goto L_0x0562
            if (r0 == r13) goto L_0x0561
            r1 = r3
            goto L_0x0562
        L_0x0561:
            r1 = r13
        L_0x0562:
            r2.processingOnServerStatus = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.nano.b.d(l20):ru.ok.tamtam.nano.Protos$Attaches$Attach");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, m20] */
    public static k8g e(Protos.Attaches attaches) {
        Protos.Attaches.Attach.InlineKeyboard inlineKeyboard;
        Protos.Attaches attaches2 = attaches;
        ? obj = new Object();
        Protos.Attaches.Attach.InlineKeyboard inlineKeyboard2 = attaches2.keyboard;
        if (inlineKeyboard2 != null) {
            obj.b = k(inlineKeyboard2);
        }
        Protos.Attaches.Attach.ReplyKeyboard replyKeyboard = attaches2.replyKeyboard;
        if (replyKeyboard != null) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                Protos.Attaches.Attach.ReplyButtons[] replyButtonsArr = replyKeyboard.buttons;
                if (i >= replyButtonsArr.length) {
                    break;
                }
                Protos.Attaches.Attach.ReplyButtons replyButtons = replyButtonsArr[i];
                if (replyButtons != null) {
                    arrayList.add(new vgc());
                    int i2 = 0;
                    while (true) {
                        Protos.Attaches.Attach.ReplyButton[] replyButtonArr = replyButtons.replyButton;
                        if (i2 >= replyButtonArr.length) {
                            break;
                        }
                        Protos.Attaches.Attach.ReplyButton replyButton = replyButtonArr[i2];
                        if (replyButton != null) {
                            vgc vgc = (vgc) arrayList.get(i);
                            int i3 = replyButton.type;
                            int i4 = i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? 5 : 4 : 3 : 2 : 1;
                            int i5 = replyButton.intent;
                            int i6 = i5 != 0 ? i5 != 1 ? i5 != 2 ? 4 : 3 : 2 : 1;
                            Protos.Attaches.Attach.Photo photo = replyButton.image;
                            vgc.add(new tgc(i4, i6, replyButton.text, photo != null ? n(photo) : null, replyButton.outgoingMessageId));
                        }
                        i2++;
                    }
                }
                i++;
            }
            obj.c = new wgc(arrayList, replyKeyboard.defaultInputDisabled);
        }
        for (Protos.Attaches.Attach attach : attaches2.attach) {
            if (obj.b != null || (inlineKeyboard = attach.inlineKeyboard) == null) {
                obj.a(c(attach));
            } else {
                obj.b = k(inlineKeyboard);
            }
        }
        return obj.c();
    }

    public static Protos.Attaches f(k8g k8g) {
        Protos.Attaches attaches = new Protos.Attaches();
        int size = ((List) k8g.a).size();
        Protos.Attaches.Attach[] attachArr = new Protos.Attaches.Attach[size];
        for (int i = 0; i < size; i++) {
            attachArr[i] = d(k8g.h(i));
        }
        attaches.attach = attachArr;
        z07 z07 = (z07) k8g.b;
        if (z07 != null) {
            attaches.keyboard = l(z07);
        }
        wgc wgc = (wgc) k8g.c;
        if (wgc != null) {
            Protos.Attaches.Attach.ReplyKeyboard replyKeyboard = new Protos.Attaches.Attach.ReplyKeyboard();
            ArrayList arrayList = new ArrayList();
            for (List<tgc> it : wgc.a) {
                ArrayList arrayList2 = new ArrayList();
                arrayList.add(arrayList2);
                for (tgc tgc : it) {
                    Protos.Attaches.Attach.ReplyButton replyButton = new Protos.Attaches.Attach.ReplyButton();
                    int s = au1.s(tgc.b);
                    int i2 = 1;
                    replyButton.intent = s != 0 ? s != 1 ? s != 2 ? 3 : 2 : 1 : 0;
                    int s2 = au1.s(tgc.a);
                    if (s2 == 0) {
                        i2 = 0;
                    } else if (s2 != 1) {
                        i2 = s2 != 2 ? 3 : 2;
                    }
                    replyButton.type = i2;
                    String str = tgc.c;
                    if (str == null) {
                        str = "";
                    }
                    replyButton.text = str;
                    replyButton.outgoingMessageId = tgc.e;
                    x10 x10 = tgc.d;
                    if (x10 != null) {
                        replyButton.image = o(x10);
                    }
                    arrayList2.add(replyButton);
                }
            }
            Protos.Attaches.Attach.ReplyButtons[] replyButtonsArr = new Protos.Attaches.Attach.ReplyButtons[arrayList.size()];
            Protos.Attaches.Attach.ReplyButton[] replyButtonArr = new Protos.Attaches.Attach.ReplyButton[0];
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                Protos.Attaches.Attach.ReplyButtons replyButtons = new Protos.Attaches.Attach.ReplyButtons();
                replyButtons.replyButton = (Protos.Attaches.Attach.ReplyButton[]) ((List) arrayList.get(i3)).toArray(replyButtonArr);
                replyButtonsArr[i3] = replyButtons;
            }
            replyKeyboard.buttons = replyButtonsArr;
            replyKeyboard.defaultInputDisabled = wgc.b;
            attaches.replyKeyboard = replyKeyboard;
        }
        return attaches;
    }

    public static x82 g(Protos.Chat.ChatMedia chatMedia) {
        int i = chatMedia.totalCount;
        long j = chatMedia.firstMessageId;
        long j2 = chatMedia.lastMessageId;
        Protos.Chat.Chunk chunk = chatMedia.chunk;
        ArrayList arrayList = null;
        d92 i2 = chunk != null ? i(chunk) : null;
        Protos.Chat.Chunk[] chunkArr = chatMedia.chunks;
        if (chunkArr != null && chunkArr.length > 0) {
            for (Protos.Chat.Chunk i3 : chunkArr) {
                d92 i4 = i(i3);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(i4);
            }
        }
        return new x82(i2, i, j, j2, arrayList == null ? Collections.emptyList() : arrayList);
    }

    public static Protos.Chat.ChatMedia h(x82 x82) {
        Protos.Chat.ChatMedia chatMedia = new Protos.Chat.ChatMedia();
        chatMedia.firstMessageId = x82.c;
        chatMedia.lastMessageId = x82.d;
        chatMedia.totalCount = x82.b;
        d92 d92 = x82.a;
        if (d92 != null) {
            chatMedia.chunk = j(d92);
        }
        List list = x82.e;
        if (list.size() > 0) {
            chatMedia.chunks = new Protos.Chat.Chunk[list.size()];
            for (int i = 0; i < list.size(); i++) {
                chatMedia.chunks[i] = j((d92) list.get(i));
            }
        }
        return chatMedia;
    }

    public static d92 i(Protos.Chat.Chunk chunk) {
        long j = chunk.startTime;
        if (j == -1) {
            hm9.l0("Chunk.Builder", "", new IllegalStateException("start time is -1"));
        }
        long j2 = chunk.endTime;
        if (j2 == -1) {
            hm9.l0("Chunk.Builder", "", new IllegalStateException("end time is -1"));
        }
        return new d92(j, j2);
    }

    public static Protos.Chat.Chunk j(d92 d92) {
        Protos.Chat.Chunk chunk = new Protos.Chat.Chunk();
        chunk.startTime = d92.a;
        chunk.endTime = d92.b;
        return chunk;
    }

    public static z07 k(Protos.Attaches.Attach.InlineKeyboard inlineKeyboard) {
        Protos.Attaches.Attach.InlineKeyboard inlineKeyboard2 = inlineKeyboard;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            Protos.Attaches.Attach.Buttons[] buttonsArr = inlineKeyboard2.buttons;
            if (i < buttonsArr.length) {
                Protos.Attaches.Attach.Buttons buttons = buttonsArr[i];
                arrayList.add(new ArrayList());
                int i2 = 0;
                while (true) {
                    Protos.Attaches.Attach.Button[] buttonArr = buttons.button;
                    if (i2 >= buttonArr.length) {
                        break;
                    }
                    Protos.Attaches.Attach.Button button = buttonArr[i2];
                    lv0 lv0 = (lv0) arrayList.get(i);
                    int i3 = button.type;
                    int i4 = 3;
                    nv0 nv0 = i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 5 ? i3 != 6 ? i3 != 7 ? nv0.UNKNOWN : nv0.OPEN_APP : nv0.MESSAGE : nv0.CHAT : nv0.REQUEST_GEO_LOCATION : nv0.REQUEST_CONTACT : nv0.LINK : nv0.CALLBACK;
                    int i5 = button.intent;
                    if (i5 == 0) {
                        i4 = 1;
                    } else if (i5 == 1) {
                        i4 = 2;
                    } else if (i5 != 2) {
                        i4 = 4;
                    }
                    String str = button.title;
                    String str2 = button.url;
                    String str3 = button.payload;
                    boolean z = button.quickLocation;
                    long j = button.contactId;
                    boolean z2 = button.showLoading;
                    cv0 cv0 = new cv0(str, nv0, i4);
                    cv0.d = str2;
                    cv0.e = str3;
                    cv0.h = j;
                    cv0.f = z;
                    cv0.g = z2;
                    lv0.add(new fv0(cv0));
                    i2++;
                    i = i;
                }
                i++;
            } else {
                int i6 = z07.c;
                y07 y07 = new y07();
                y07.a = arrayList;
                y07.b = inlineKeyboard2.callbackId;
                return new z07(y07);
            }
        }
    }

    public static Protos.Attaches.Attach.InlineKeyboard l(z07 z07) {
        Protos.Attaches.Attach.InlineKeyboard inlineKeyboard = new Protos.Attaches.Attach.InlineKeyboard();
        List list = z07.a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            String str = "";
            if (it.hasNext()) {
                ArrayList arrayList2 = new ArrayList();
                arrayList.add(arrayList2);
                for (fv0 fv0 : (List) it.next()) {
                    Protos.Attaches.Attach.Button button = new Protos.Attaches.Attach.Button();
                    int s = au1.s(fv0.c);
                    int i = 1;
                    button.intent = s != 0 ? s != 1 ? s != 2 ? 3 : 2 : 1 : 0;
                    switch (fv0.b.ordinal()) {
                        case 0:
                            i = 0;
                            break;
                        case 1:
                            break;
                        case 2:
                            i = 2;
                            break;
                        case 3:
                            i = 3;
                            break;
                        case 4:
                            i = 5;
                            break;
                        case 5:
                            i = 7;
                            break;
                        case 6:
                            i = 6;
                            break;
                        default:
                            i = 4;
                            break;
                    }
                    button.type = i;
                    String str2 = fv0.a;
                    if (str2 == null) {
                        str2 = str;
                    }
                    button.title = str2;
                    String str3 = fv0.o;
                    if (str3 == null) {
                        str3 = str;
                    }
                    button.url = str3;
                    String str4 = fv0.X;
                    if (str4 == null) {
                        str4 = str;
                    }
                    button.payload = str4;
                    button.showLoading = fv0.s0;
                    button.quickLocation = fv0.Y;
                    button.contactId = fv0.Z;
                    arrayList2.add(button);
                }
            } else {
                Protos.Attaches.Attach.Buttons[] buttonsArr = new Protos.Attaches.Attach.Buttons[arrayList.size()];
                Protos.Attaches.Attach.Button[] buttonArr = new Protos.Attaches.Attach.Button[0];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    Protos.Attaches.Attach.Buttons buttons = new Protos.Attaches.Attach.Buttons();
                    buttons.button = (Protos.Attaches.Attach.Button[]) ((List) arrayList.get(i2)).toArray(buttonArr);
                    buttonsArr[i2] = buttons;
                }
                inlineKeyboard.buttons = buttonsArr;
                String str5 = z07.b;
                if (str5 != null) {
                    str = str5;
                }
                inlineKeyboard.callbackId = str;
                return inlineKeyboard;
            }
        }
    }

    public static Protos.Attaches.LocationInfo m(v10 v10) {
        Protos.Attaches.LocationInfo locationInfo = new Protos.Attaches.LocationInfo();
        er7 er7 = v10.a;
        locationInfo.latitude = er7.a;
        locationInfo.longitude = er7.b;
        locationInfo.altitude = er7.c;
        locationInfo.accuracy = er7.o;
        locationInfo.bearing = er7.X;
        locationInfo.speed = er7.Y;
        locationInfo.time = v10.b;
        return locationInfo;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [w10, java.lang.Object] */
    public static x10 n(Protos.Attaches.Attach.Photo photo) {
        x10 x10 = x10.w0;
        ? obj = new Object();
        obj.a = photo.baseUrl;
        obj.b = photo.photoUrl;
        obj.c = photo.width;
        obj.d = photo.height;
        obj.e = photo.gif;
        obj.f = photo.previewData;
        obj.g = photo.photoToken;
        obj.h = photo.photoId;
        obj.i = photo.mp4Url;
        obj.k = oag.t(photo.previewUrl) ? null : photo.previewUrl;
        obj.j = photo.externalGifId;
        return obj.a();
    }

    public static Protos.Attaches.Attach.Photo o(x10 x10) {
        Protos.Attaches.Attach.Photo photo = new Protos.Attaches.Attach.Photo();
        String str = x10.a;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        photo.baseUrl = str;
        String str3 = x10.b;
        if (str3 == null) {
            str3 = str2;
        }
        photo.photoUrl = str3;
        photo.width = x10.c;
        photo.height = x10.o;
        photo.gif = x10.X;
        byte[] bArr = x10.Y;
        if (bArr != null) {
            photo.previewData = bArr;
        }
        String str4 = x10.v0;
        if (str4 == null) {
            str4 = str2;
        }
        photo.previewUrl = str4;
        String str5 = x10.Z;
        if (str5 == null) {
            str5 = str2;
        }
        photo.photoToken = str5;
        photo.photoId = x10.s0;
        String str6 = x10.t0;
        if (str6 == null) {
            str6 = str2;
        }
        photo.mp4Url = str6;
        String str7 = x10.u0;
        if (str7 != null) {
            str2 = str7;
        }
        photo.externalGifId = str2;
        return photo;
    }

    public static int p(int i) {
        int s = au1.s(i);
        int i2 = 1;
        if (s != 1) {
            i2 = 2;
            if (s != 2) {
                i2 = 3;
                if (s != 3) {
                    i2 = 4;
                    if (s != 4) {
                        i2 = 5;
                        if (s != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i2;
    }
}
