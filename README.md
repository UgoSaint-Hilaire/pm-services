# pm-services - Backend Microservices

Ce répertoire contient l'ensemble des microservices backend pour notre application de réseau social autour d'événements.

## Structure du projet

Le projet est organisé en plusieurs microservices :

- `user-auth-service/` : Gestion des utilisateurs et authentification
*WIP*

## Prérequis

- Java 17+
- Maven 3.6+
- Docker (pour le déploiement des services)

## Installation et démarrage

1. Clonez ce répertoire :
  git clone https://github.com/UgoSaint-Hilaire/pm-services/

2. Naviguez dans le répertoire du projet :
   cd *nom du répertoire*

3. Construisez tous les services :
  mvn clean install

4. Pour démarrer un service spécifique :
  cd *nom du service*
  mvn spring-boot:run
