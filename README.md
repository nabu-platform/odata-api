# Dynamics

There seems to be a bug in Dynamics OData (or possibly broader in the microsoft stack) where $skip is not working.
Nor does it return a nextlink 

# Delta syncs

To keep systems in sync, the delta sink could be a good feature. Without $top you can do a list with header

```
Prefer: odata.track-changes
```

At this point you should get a deltatoken which you can pass in subsequent requests as $deltatoken. Presumably it returns the changes that have occurred since the last sync.
This could be a nice way to keep systems in sync.

However, it must be enabled, otherwise you get something like:

```
{"error":{"code":"0x80072491","message":"Entity nrq_declaration isn't enabled for change tracking."}}
```