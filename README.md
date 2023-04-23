# Automatic Advanced Settings Expander
Automatically expands the advanced settings in the Settings app by hooking setInitialExpandedChildrenCount in PreferenceGroup. I hate to always expand them myself everytime.

Should work on all Android versions where the Settings app uses one of

- androidx.preference.PreferenceGroup
- android.preference.PreferenceGroup
- android.support.v7.preference.PreferenceGroup

Please report where it stops working so that I can edit the minSdkVersion or add missing classes.

This is an Xposed module [part of the LSPosed Module Repo](https://github.com/Xposed-Modules-Repo/de.binarynoise.automaticadvancedsettingsexpander) or in the LSPosed App.

| before | after |
|--------|-------|
|![before](https://user-images.githubusercontent.com/50302352/156211967-6d72f9c2-4185-4e75-8e88-0dc9b282945e.png)|![after](https://user-images.githubusercontent.com/50302352/156211962-ced38048-4970-4fa4-bdb0-51fcba2b4f6a.png)|



# License
This module is licensed under the [European Union Public Licence (EUPL) v. 1.2](https://joinup.ec.europa.eu/collection/eupl/eupl-text-eupl-12)
