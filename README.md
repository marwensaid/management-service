Spies avec Mockito

Introduction

Ce TD a pour objectif de vous familiariser avec l'utilisation des spies dans Mockito. Contrairement aux mocks, un spy est une instance réelle d'une classe, mais certaines méthodes peuvent être surveillées ou remplacées pour simuler des comportements spécifiques. Vous utiliserez des spies pour tester une application de gestion de commandes.
Objectifs pédagogiques

    Comprendre la différence entre un mock et un spy.
    Savoir quand utiliser un spy dans vos tests.
    Apprendre à écrire des tests unitaires avancés avec des spies.
    Maîtriser des cas complexes de tests en combinant des spies avec d'autres fonctionnalités de Mockito.

Contexte et Description de l'Application

L'application est un système de gestion de commandes. Elle permet de :

    Créer une commande : Ajouter des produits à une commande.
    Calculer le total de la commande : Calculer le prix total des produits dans une commande.
    Appliquer des réductions : Appliquer des remises spécifiques selon certaines règles.
    Générer une facture : Générer une facture détaillée pour une commande.

Vous utiliserez les spies pour tester des scénarios où :

    Certaines méthodes sont exécutées normalement et d'autres sont simulées.
    Vous surveillez des appels à des méthodes spécifiques.
    Vous avez besoin d'exécuter du code réel tout en ayant un contrôle partiel sur certaines parties.

Architecture de l'Application

L'application est composée des classes suivantes :

    Product : Représente un produit avec un nom, un prix et une quantité.
    Order : Représente une commande contenant une liste de produits.
    DiscountService : Contient la logique pour appliquer des remises sur une commande.
    InvoiceGenerator : Génère une facture pour une commande.

Consignes

    Étape 1 : Comprendre le code
        Étudiez le code de base fourni.
        Identifiez les responsabilités de chaque classe.

    Étape 2 : Écrire des tests avec des spies
        Écrivez des tests pour chaque classe en utilisant des spies.
        Utilisez les spies pour surveiller les appels à des méthodes ou pour simuler certains comportements.

    Étape 3 : Tester des cas complexes
        Combinez les spies avec des mocks pour tester des scénarios complexes.
        Ajoutez des assertions pour vérifier les interactions entre les classes.

    Niveaux de tests
        Facile : Testez des méthodes simples avec des spies.
        Moyen : Testez des méthodes avec des dépendances simulées.
        Difficile : Testez des scénarios avec des calculs complexes ou des conditions spécifiques.
        Très difficile : Testez des cas de bord avec des combinaisons de mocks et de spies.
