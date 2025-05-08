.. SPDX-License-Identifier: CC-BY-SA-2.0-UK

.. |yocto-codename| replace:: whinlatter
.. |yocto-ver| replace:: 5.3
.. Note: anchors id below cannot contain substitutions so replace them with the
   value of |yocto-ver| above.

Release |yocto-ver| (|yocto-codename|)
======================================

Migration notes for |yocto-ver| (|yocto-codename|)
--------------------------------------------------

This section provides migration information for moving to the Yocto
Project |yocto-ver| Release (codename "|yocto-codename|") from the prior release.

Supported kernel versions
~~~~~~~~~~~~~~~~~~~~~~~~~

The :term:`OLDEST_KERNEL` setting is XXX in this release, meaning that
out the box, older kernels are not supported. See :ref:`4.3 migration notes
<migration-4.3-supported-kernel-versions>` for details.

Supported distributions
~~~~~~~~~~~~~~~~~~~~~~~

Compared to the previous releases, running BitBake is supported on new
GNU/Linux distributions:

-  XXX

On the other hand, some earlier distributions are no longer supported:

-  XXX

See :ref:`all supported distributions <system-requirements-supported-distros>`.

Rust language changes
~~~~~~~~~~~~~~~~~~~~~

systemd changes
~~~~~~~~~~~~~~~

Recipe changes
~~~~~~~~~~~~~~

Removed variables
~~~~~~~~~~~~~~~~~

The following variables have been removed:

Removed recipes
~~~~~~~~~~~~~~~

The following recipes have been removed in this release:

Removed classes
~~~~~~~~~~~~~~~

The following classes have been removed in this release:

Removed features
~~~~~~~~~~~~~~~~

The following features have been removed in this release:

Miscellaneous changes
~~~~~~~~~~~~~~~~~~~~~
