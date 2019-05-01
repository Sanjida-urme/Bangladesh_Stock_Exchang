package com.google.android.gms.internal;

final class zzfgk {
    static String zzaq(zzfdp zzfdp) {
        zzfgm zzfgl = new zzfgl(zzfdp);
        StringBuilder stringBuilder = new StringBuilder(zzfgl.size());
        for (int i = 0; i < zzfgl.size(); i++) {
            String str;
            int zzke = zzfgl.zzke(i);
            if (zzke == 34) {
                str = "\\\"";
            } else if (zzke == 39) {
                str = "\\'";
            } else if (zzke != 92) {
                switch (zzke) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (zzke < 32 || zzke > 126) {
                            stringBuilder.append('\\');
                            stringBuilder.append((char) (((zzke >>> 6) & 3) + 48));
                            stringBuilder.append((char) (((zzke >>> 3) & 7) + 48));
                            zzke = (zzke & 7) + 48;
                        }
                        stringBuilder.append((char) zzke);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }
}
